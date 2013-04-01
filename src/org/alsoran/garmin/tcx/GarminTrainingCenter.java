package org.alsoran.garmin.tcx;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.alsoran.garmin.jaxb.ActivityLapT;
import org.alsoran.garmin.jaxb.ActivityListT;
import org.alsoran.garmin.jaxb.ActivityT;
import org.alsoran.garmin.jaxb.TrainingCenterDatabaseT;
import org.alsoran.parseconfig.RunLogReader;
import org.alsoran.utility.Converter;

public class GarminTrainingCenter implements RunLogReader {

	private double totalTimeInSeconds =  0;
	double distanceInMeter = 0;

	private String config = "";
	private TrainingCenterDatabaseT tpx = null;

	public GarminTrainingCenter() {
		tpx = new TrainingCenterDatabaseT();
	}
	public void readConfigFile() throws FileNotFoundException, JAXBException {
		FileReader fr = null;

		fr = new FileReader(config);
		JAXBContext context = null;

		context = JAXBContext.newInstance(TrainingCenterDatabaseT.class);
		Unmarshaller um = null;

		try {
			um = context.createUnmarshaller();
		} catch (JAXBException e) {
			System.out.println("In " + this.getClass() + " read caught JAXB ");
			e.printStackTrace();
		}

		try {
			@SuppressWarnings("unchecked")
			JAXBElement<TrainingCenterDatabaseT> root = (JAXBElement<TrainingCenterDatabaseT>) um.unmarshal(fr);
			tpx = root.getValue();
			getTotalDistanceTime(tpx);

		} catch (JAXBException e) {
			System.out.println("error: " + e.getMessage());
			System.out.println("In " + this.getClass() + " read caught JAXBE ");
			e.printStackTrace();

		} catch(ClassCastException e) {
			System.out.println("error: " + e.getMessage());
			e.printStackTrace();
		}

	}
	private void getTotalDistanceTime(TrainingCenterDatabaseT tpx) {
		
		ActivityListT activityList = tpx.getActivities();
		List<ActivityT> activities = activityList.getActivity();
		for(ActivityT activity : activities) {
			for(ActivityLapT lap : activity.getLap() ) {
				setTotalTimeInSeconds(getTotalTimeInSeconds() + lap.getTotalTimeSeconds());
				distanceInMeter = distanceInMeter + lap.getDistanceMeters();
				
			}			
		}
	}
	public void setConfigFile(String xml) {
		config = xml;		
	}
	public double getDistanceMiles() {
		return (double) Converter.meterstoMiles(distanceInMeter);
	}
	public double getDistanceMeters() {
		return (double) distanceInMeter;
	}
	public double getTotalTimeInSeconds() {
		return totalTimeInSeconds;
	}
	private void setTotalTimeInSeconds(double totalTimeInSeconds) {
		this.totalTimeInSeconds = totalTimeInSeconds;
	}

	public void writeConfigFile() throws JAXBException {
		//not finished
		JAXBContext context = null;
						
		if(tpx == null) {
			tpx = new TrainingCenterDatabaseT();
		}
		ActivityListT value = new ActivityListT();
		tpx.setActivities(value);
				
		context = JAXBContext.newInstance(TrainingCenterDatabaseT.class);
		Marshaller marshaller = null;

		try {
			marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		} catch (JAXBException e) {
			System.out.println("In " + this.getClass() + " read caught JAXB " + e);
		}

		try {
			marshaller.marshal(tpx, System.out);			
		} catch (JAXBException e) {
			System.out.println("In " + this.getClass() + " read caught JAXBE " + e);
			e.printStackTrace();
		}
	}

	
	public static void main(String[] args) {
		GarminTrainingCenter gtc = new GarminTrainingCenter();
		
		boolean isread = true;
		
		if(isread) {
		
			try {
				String tcx = "resources/2_4_13activity_269789305.tcx";
				@SuppressWarnings("unused")
				String JUnitTcx = "resources/JUnitActivity.tcx";
				gtc.setConfigFile(tcx);
				gtc.readConfigFile();

				
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (JAXBException e) {
				e.printStackTrace();
			}
			System.out.println("distance in miles: " + gtc.getDistanceMiles());
			System.out.println("time in miles: " + Converter.secondsToHMS((int) gtc.getTotalTimeInSeconds()));
		} else {
			try {
				gtc.writeConfigFile();
			} catch (JAXBException e) {
				e.printStackTrace();
			}
		}
	}

	
}

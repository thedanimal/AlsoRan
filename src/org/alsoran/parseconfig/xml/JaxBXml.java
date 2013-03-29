package org.alsoran.parseconfig.xml;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.alsoran.parseconfig.RunLogReader;

public class JaxBXml implements RunLogReader {

	RunningLog runningLog = null;
	private String config = "";

	public JaxBXml() {
		config = "resources/OldRunningLog.xml";
	}
	public void readConfigFile() throws FileNotFoundException, JAXBException {
		FileReader fr = null;

		fr = new FileReader(config);
		JAXBContext context = null;

		context = JAXBContext.newInstance(RunningLog.class);
		Unmarshaller um = null;

		try {
			um = context.createUnmarshaller();
		} catch (JAXBException e) {
			System.out.println("In " + this.getClass() + " read caught JAXB ");
			e.printStackTrace();
		}

		try {
			runningLog = (RunningLog) um.unmarshal(fr);
			
//			iterate(runningLog);

		} catch (JAXBException e) {
			System.out.println("In " + this.getClass() + " read caught JAXBE ");
			e.printStackTrace();

		} catch(ClassCastException e) {
			e.printStackTrace();
		}
	}
	public void writeConfigFile() throws JAXBException {
		JAXBContext context = null;
				
		Running run = ObjectFactory.createObject();
		
		if(runningLog == null) {
			runningLog = new RunningLog();
		}
		runningLog.setRunning(run);
		
		context = JAXBContext.newInstance(RunningLog.class);
		Marshaller marshaller = null;

		try {
			marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		} catch (JAXBException e) {
			System.out.println("In " + this.getClass() + " read caught JAXB " + e);
		}

		try {
			marshaller.marshal(runningLog, System.out);			
		} catch (JAXBException e) {
			System.out.println("In " + this.getClass() + " read caught JAXBE " + e);
			e.printStackTrace();
		}
	}
	public float getTotalMiles() {
		float totalMiles = 0;
		
		try {
			for(Sneaker sneaker :runningLog.getRunning().getSneakers()) {
				for(Distance distance : sneaker.getDistances() ) {
					totalMiles = totalMiles + distance.getValue();
				}				
			}
		} catch(NullPointerException ignored) { 
			return -1;
		}
		
		return totalMiles;
	}

	public void setConfigFile(String xml) {
		config = xml;		
	}
	
	private void iterate(RunningLog rl) {
		
		try {
			Running running = rl.getRunning();
			System.out.println("Sneaker Name");
			for(Sneaker sneaker : running.getSneakers()) {
				System.out.println(sneaker.getName()  );
				List<Distance> ds = sneaker.getDistances();
				System.out.println("\tDate\t\tDistance");
				for(Distance d : ds) {
					System.out.println("\t" + d.getDate() + "\t" + d.getValue());
				}
						
			}
		} catch (NullPointerException npe) {
				npe.printStackTrace();
		}

	}

	public RunningLog getRunner() {
		return runningLog;
	}

	public static void main(String[] args) {

		JaxBXml xml = new JaxBXml();
		
		boolean writing = false;
		if(writing) {
//I use writing to create the xml to create the xsd to generate the jaxb
			try {
				xml.writeConfigFile();
			} catch (JAXBException e) {
				e.printStackTrace();
			}			
		} else {
			try {
				xml.readConfigFile();
				xml.getTotalMiles();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (JAXBException e) {
				e.printStackTrace();
			}
		}
	}
}

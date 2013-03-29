package org.alsoran.parseconfig.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "runningLog")
@XmlAccessorType(XmlAccessType.FIELD)
public class Workout {

	@XmlAttribute
    private String date;
	
	@XmlAttribute
	private Float distance;

	@XmlAttribute
	private int timeInSeconds;
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Float getDistance() {
		return distance;
	}
	public void setDistance(Float distance) {
		this.distance = distance;
	}
	public int getTimeInSeconds() {
		return timeInSeconds;
	}
	public void setTimeInSeconds(int timeInSeconds) {
		this.timeInSeconds = timeInSeconds;
	}
}
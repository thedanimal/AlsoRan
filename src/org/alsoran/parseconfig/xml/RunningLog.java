package org.alsoran.parseconfig.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "runningLog")
@XmlAccessorType(XmlAccessType.FIELD)
public class RunningLog {

    @XmlElement(name = "Running")
	private Running running;

	public Running getRunning() {
		return running;
	}

	public void setRunning(Running running) {
		this.running = running;
	}
}

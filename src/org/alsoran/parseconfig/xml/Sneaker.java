
package org.alsoran.parseconfig.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Sneaker {

    @XmlAttribute
    private String name;

    @XmlElement(name = "Distance")
    private List<Distance> distances;    

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Distance> getDistances() {
		return distances;
	}
	public void setDistances(List<Distance> distances) {
		this.distances = distances;
	}

}

package org.alsoran.parseconfig.xml;

import java.util.Collections;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Running {
	
    @XmlElement(name = "Sneaker")
    private List<Sneaker> sneakers;
    
		
//  @XmlElement(name = "TotalMiles")
//  private float miles;
//    public Running() {
//    	miles = (float) 0.0;
//    }
//	public float getMiles() {
//		for (Sneaker sneaker : getSneakers()) {
//			for(Workout workout : sneaker.getWorkouts()) {
//				miles = miles + workout.getDistance();
//			}
//		}
//		return miles;
//	}
//	public void setMiles(float miles) {
//		this.miles = miles;
//	}
	public List<Sneaker> getSneakers() {
		if(sneakers == null || sneakers.isEmpty()) {
			return Collections.emptyList();
		}
		return sneakers;
	}
	public void setSneakers(List<Sneaker> sneakers) {
		this.sneakers = sneakers;
	}

}

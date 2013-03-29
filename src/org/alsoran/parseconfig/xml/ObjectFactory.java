package org.alsoran.parseconfig.xml;

import java.util.ArrayList;
import java.util.List;

public class ObjectFactory {

	static public Running createObject() {
		Sneaker sneaker1 = new Sneaker();

		Distance d1 = new Distance();
		d1.setDate("Feb. 1, 2013");
		d1.setValue((float) 10.0);

		Distance d2 = new Distance();
		d2.setDate("Feb. 11, 2013");
		d2.setValue((float) 5.0);

		List<Distance> ds = new ArrayList<Distance>();
		ds.add(d1);
		ds.add(d2);
		
		sneaker1.setName("FlowRidder");
		sneaker1.setDistances(ds);

		Sneaker sneaker2 = new Sneaker();
	
		
		Distance d3 = new Distance();
		d3.setDate("Feb. 12, 2013");
		d3.setValue((float) 9.3);

		Distance d4 = new Distance();
		d4.setDate("Feb. 18, 2013");
		d4.setValue((float) 6.01);

		
		List<Distance> ds2 = new ArrayList<Distance>();
		ds2.add(d3);
		ds2.add(d4);

		sneaker2.setName("Glycerin");
		sneaker2.setDistances(ds2);

				
		List<Sneaker> sneakers = new ArrayList<Sneaker>();
		sneakers.add(sneaker1);
		sneakers.add(sneaker2);
		
		Running run = new Running();
		run.setSneakers(sneakers);
						
		return run;

	}
	public static void main(String[] args) {
	}

}

package org.alsoran.tests;

import org.alsoran.utility.Converter;

import junit.framework.TestCase;



public class ConverterTest extends TestCase {


	@Override
	protected void setUp() throws Exception {

	}
	public void testMilestoMeter(){
		
		assertEquals(1.0, Converter.meterstoMiles(1609));
		assertEquals(1609.0, Converter.milestoMeters(1));
	}

	/**
	 * @param args
	 */
	 public static void main(String[] args) {
		 // TODO Auto-generated method stub

	 }

}

package org.alsoran.tests;

import org.alsoran.utility.Converter;

import junit.framework.TestCase;



public class ConverterTest extends TestCase {


	@Override
	protected void setUp() throws Exception {

	}
	public void testMilestoMeter(){		
		assertEquals(1609.0, Converter.milestoMeters(1));
	}
	public void testMetersToMiles(){
		assertEquals(1.0, Converter.meterstoMiles(1609));
		
	}
	public void testHMSToSeconds(){
		assertEquals(3600.0, Converter.hmsToSeconds("1:00:00"));
		assertEquals(3600.0, Converter.hmsToSeconds("1:0:0"));
		assertEquals(3610.0, Converter.hmsToSeconds("1:0:10"));	
		assertEquals(3700.0, Converter.hmsToSeconds("1:01:40"));	
		assertEquals(100.0, Converter.hmsToSeconds("0:01:40"));	
		assertEquals(520.0, Converter.hmsToSeconds("0:08:40"));	
		assertEquals(520.0, Converter.hmsToSeconds("0:8:40"));	
		assertEquals(52.0, Converter.hmsToSeconds("0:00:52"));	
		assertEquals(52.0, Converter.hmsToSeconds("00:00:52"));	
		assertEquals(52.0, Converter.hmsToSeconds("00:52"));	
		assertEquals(52.0, Converter.hmsToSeconds("0:52"));	
		assertEquals(52.0, Converter.hmsToSeconds("52"));	
		assertEquals(9.0, Converter.hmsToSeconds("0:0:9"));	
		
	}
	public void testSecondsToHMS(){
		assertEquals("01:00:00", Converter.secondsToHMS(3600));
		assertEquals("01:00:10", Converter.secondsToHMS(3610));	
		assertEquals("01:01:40", Converter.secondsToHMS(3700));	
		assertEquals("00:01:40", Converter.secondsToHMS(100));	
		assertEquals("00:08:40", Converter.secondsToHMS(520));	
		assertEquals("00:00:52", Converter.secondsToHMS(52));	
		assertEquals("00:00:09", Converter.secondsToHMS(9));
	}


	/**
	 * @param args
	 */
	 public static void main(String[] args) {
		 // TODO Auto-generated method stub

	 }

}

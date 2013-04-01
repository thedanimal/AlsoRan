package org.alsoran.tests;

import junit.framework.TestCase;

import org.alsoran.garmin.tcx.GarminTrainingCenter;

public class GarminTrainingCenterTest extends TestCase {

	GarminTrainingCenter gtc = null;
	@Override
	protected void setUp() throws Exception {
		gtc = new GarminTrainingCenter();
		gtc.setConfigFile("resources/JUnitActivity.tcx");
		gtc.readConfigFile();
	}
	public void testTotalMeters(){		
		assertEquals(8055.83, gtc.getDistanceMeters());
	}
	public void testTotalSeconds(){		
		assertEquals(2132.7660000000005, gtc.getTotalTimeInSeconds());
	}

}

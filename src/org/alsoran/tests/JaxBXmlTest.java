package org.alsoran.tests;

import java.io.FileNotFoundException;

import javax.xml.bind.JAXBException;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.alsoran.parseconfig.xml.Running;
import org.alsoran.parseconfig.xml.JaxBXml;


public class JaxBXmlTest extends TestCase {
	JaxBXml xml = null;
	Running runner = null;
	
	public static TestSuite suite() {
		TestSuite suite = new TestSuite();
		suite.addTestSuite(JaxBXmlTest.class);
		return suite;
	}
	   
	@Override
	protected void setUp() throws Exception {
		xml = new JaxBXml();
		try {
			xml.setConfigFile("resources/RunningLogForJUnit.xml");
			xml.readConfigFile();
			runner = xml.getRunner().getRunning();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (JAXBException e) {
			e.printStackTrace();
		}		
	}
	public void testTotalMiles() {
		assertEquals((float)20.0, xml.getTotalMiles());
	}
	public void testSneakers() {
		assertEquals(2, runner.getSneakers().size());
	}
}

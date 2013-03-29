package org.alsoran.parseconfig;

import java.io.FileNotFoundException;

import javax.xml.bind.JAXBException;

public interface RunLogReader {

	public void readConfigFile() throws FileNotFoundException, JAXBException;
	public void setConfigFile(String xml);
	
}

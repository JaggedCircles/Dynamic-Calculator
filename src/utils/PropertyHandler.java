package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.xml.bind.PropertyException;

public class PropertyHandler {
    private String host;
    private int port;
    private String classRootDir;
    
    public PropertyHandler(String filepath) throws PropertyException, FileNotFoundException, IOException {
        Properties properties = new Properties();
	properties.load(new FileInputStream(filepath));
	  
	host = properties.getProperty("HOST");
	if(host == null)
	    throw new PropertyException("HOST is not set.");
	      
	String portString = properties.getProperty("PORT");
	if(portString == null)
	    throw new PropertyException("PORT is not set.");
	try {
	    port = Integer.parseInt(portString);
	} catch(NumberFormatException e) { 
	    throw new PropertyException("PORT is not a number");
	}
	
	classRootDir = properties.getProperty("CLASS_ROOT_DIRECTORY");
	if(classRootDir == null)
	    throw new PropertyException("CLASS_ROOT_DIRECTORY is not set.");
    }
    
    public int getPort()
    {
	return port;
    }
    
    public String getHost()
    {
	return host;
    }
    
    public String getClassRootDir()
    {
	return classRootDir;
    }
    
    /*
     * String dirString = System.getProperty("user.dir");
     * String completeString = dirString + File.separator + propertyFileString;
     * if ((propertyFile = new File(completeString).exists()) {
     *     return propertyFile;
     * }
     */
}

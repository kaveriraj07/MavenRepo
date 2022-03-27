package com.reader.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	
	
	public ConfigurationReader() throws IOException {
		
		File f = new File("D:\\old workspace\\eclipse-workspace\\Maven_Project\\src\\test\\java\\com\\reader\\com\\ConfigurationReader.java");
		FileInputStream fis = new FileInputStream(f);
		Properties p= new Properties();
		p.load(fis);
	}

	public String geturl() {
		
		Properties p = new Properties();                                          
		String url =p.getProperty("url");
		return url;
	}
	
	
	public String getUsername() {
		Properties p = new Properties();                                          
		String username =p.getProperty("username");
		return username;
	}
	  
	public String getPassword() {
		Properties p = new Properties();                                          
		String Password =p.getProperty("Password");
		return Password;

	}
}



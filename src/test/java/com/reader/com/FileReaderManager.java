package com.reader.com;

import java.io.IOException;

public class FileReaderManager {
	
	private FileReaderManager() {
		
	}

	
	public static FileReaderManager getInstanceFR() {
		
		FileReaderManager helper = new FileReaderManager();
		return helper;

	}
	
	public ConfigurationReader getInstanceCR() throws IOException {
		
		ConfigurationReader reader = new ConfigurationReader();
		return reader;

	}
}

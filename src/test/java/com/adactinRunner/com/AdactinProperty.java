package com.adactinRunner.com;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

import com.Maven_Project.BaseClass;
import com.pageobjectmannager.PageObjectManager;
import com.reader.com.FileReaderManager;

public class AdactinProperty extends BaseClass {
	
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		driver = browserLaunch("chrome");
		
		launchUrl(FileReaderManager.getInstanceFR().getInstanceCR().geturl());
		PageObjectManager pom = new PageObjectManager(driver);
	
		sendValues(pom.getInstatnceLogin().getUsername(), FileReaderManager.getInstanceFR().getInstanceCR().getUsername());
		sendValues(pom.getInstatnceLogin().getPassword(), FileReaderManager.getInstanceFR().getInstanceCR().getPassword());
		clickOnElement(pom.getInstatnceLogin().getLogin());
}
}
package com.Maven_Project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook extends BaseClass {
	
	public static WebDriver driver;
		
	public static void main(String[] args) throws IOException {
		

		
	driver= browserLaunch("chrome");
	launchUrl("https://www.facebook.com/");
	WebElement email = driver.findElement(By.name("email"));
	sendValues(email, "kaveriraj07@gmail.com");
	WebElement password = driver.findElement(By.name("pass"));
	sendValues(password, "1234567");
	WebElement login = driver.findElement(By.name("login"));
	clickOnElement(login);
	printScreen();
	closeWindow();
	
	
	
	}	
	
}

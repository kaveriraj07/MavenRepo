package com.adactinRunner.com;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.Maven_Project.BaseClass;
import com.pageobjectmannager.PageObjectManager;
import com.pom.com.LoginPage;

public class AdactinRunner extends BaseClass {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
			
	driver=browserLaunch("chrome");
	launchUrl("https://adactinhotelapp.com/");
	
	PageObjectManager pom = new PageObjectManager(driver);
	sendValues(pom.getInstatnceLogin().getUsername(), "kaveriraj");
	sendValues(pom.getInstatnceLogin().getPassword(), "7PU06G");
	clickOnElement(pom.getInstatnceLogin().getLogin());
	
	
	SingleDropDown(pom.getInstanceSearch().getLocation(), "visible" ,"London" );
	SingleDropDown(pom.getInstanceSearch().getHotels(), "visible", "Hotel Creek");
	SingleDropDown(pom.getInstanceSearch().getRoom_type(), "visible", "Double");
	SingleDropDown(pom.getInstanceSearch().getRoom_nos(),"value" ,"2");
	SingleDropDown(pom.getInstanceSearch().getAdult_room(), "value", "3");
	SingleDropDown(pom.getInstanceSearch().getChild_room(), "value", "4");
	clickOnElement(pom.getInstanceSearch().getSearchbtn());
	
	clickOnElement(pom.getInstanceSelect().getSelectBtn());
	clickOnElement(pom.getInstanceSelect().getContinueBtn());
	
	sendValues(pom.getInstancebook().getFirstname(), "kaveri");
	sendValues(pom.getInstancebook().getLastname(), "raj");
	sendValues(pom.getInstancebook().getAddress(), "chennai");
	sendValues(pom.getInstancebook().getCardno(), "1234567899876543");
	SingleDropDown(pom.getInstancebook().getCardtype(), "visible" ,"VISA");
	SingleDropDown(pom.getInstancebook().getExpiryMonth(), "value", "2");
	SingleDropDown(pom.getInstancebook().getExpiryYear(), "visible" ,"2022");
	sendValues(pom.getInstancebook().getCvvnumber(), "123");
	clickOnElement(pom.getInstancebook().getBooknowBtn());
	
	clickOnElement(pom.getInstancelogoutBtn().getLogout());
		
		
	}

}

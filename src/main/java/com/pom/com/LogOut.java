package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut {
	
	public WebDriver driver;
	
	@FindBy(name="logout")
	private WebElement Logout;

	public WebElement getLogout() {
		return Logout;
	}
	
	public LogOut(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		

}
}

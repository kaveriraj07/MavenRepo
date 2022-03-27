package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
	
	public WebDriver driver;
	
	
	@FindBy(name="radiobutton_0")
	private WebElement selectBtn;

	@FindBy(name="continue")
	private WebElement continueBtn;
	
	public WebElement getSelectBtn() {
		return selectBtn;
	}


	public WebElement getContinueBtn() {
		return continueBtn;
	}
	
	public SelectHotel(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	

	}
	
}

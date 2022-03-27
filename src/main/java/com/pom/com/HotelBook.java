package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelBook {
	
	public WebDriver driver;
	
	@FindBy(name="first_name")
	private WebElement firstname;
	
	
	@FindBy(name="last_name")
	private WebElement lastname;
	
	@FindBy(id="address")
	private WebElement address;
	@FindBy(name="cc_num")
	private WebElement cardno;
	@FindBy(name="cc_type")
	private WebElement cardtype;
	@FindBy(name="cc_exp_month")
	private WebElement ExpiryMonth;
	@FindBy(name="cc_exp_year")
	private WebElement ExpiryYear;
	@FindBy(name="cc_cvv")
	private WebElement cvvnumber;
	
	public WebElement getCvvnumber() {
		return cvvnumber;
	}

	@FindBy(name="book_now")
	private WebElement booknowBtn;
	
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCardno() {
		return cardno;
	}
	public WebElement getCardtype() {
		return cardtype;
	}
	public WebElement getExpiryMonth() {
		return ExpiryMonth;
	}
	public WebElement getExpiryYear() {
		return ExpiryYear;
	}
	public WebElement getBooknowBtn() {
		return booknowBtn;
	}
	
	public HotelBook(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
}
}

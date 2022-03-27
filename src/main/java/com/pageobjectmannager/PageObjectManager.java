package com.pageobjectmannager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.com.HotelBook;
import com.pom.com.LogOut;
import com.pom.com.LoginPage;
import com.pom.com.SearchHotel;
import com.pom.com.SelectHotel;

public class PageObjectManager {
	
	public  WebDriver driver;
	private LoginPage login;
	private SearchHotel search;
	private SelectHotel select;
	private HotelBook book;
	private LogOut logoutBtn;
	
	public LoginPage getInstatnceLogin() {
		
		login= new LoginPage(driver);
		return login;
	}
	
	public SearchHotel getInstanceSearch() {
		
		search= new SearchHotel(driver);
		return search;
		
	}
	
	public SelectHotel getInstanceSelect() {
		select= new SelectHotel(driver);
		return select;
	}
	
	public HotelBook getInstancebook() {
		book= new HotelBook(driver);
		return book;
	}
	
	public LogOut getInstancelogoutBtn() {
		logoutBtn= new LogOut(driver);
		return logoutBtn;
	}
	
	public PageObjectManager(WebDriver pomfinal) {
		
		this.driver= pomfinal;
		PageFactory.initElements(driver, this);
	}

}

package com.Maven_Project;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Element;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.CloseWindow;
import org.openqa.selenium.remote.server.handler.RefreshPage;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	private static final char[] Selected = null;
	public static WebDriver driver;
	private static WebElement getOption;
	
	public static WebDriver browserLaunch(String browser) {
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\old workspace\\eclipse-workspace\\Selinium\\Driver\\chromedriver.exe");
		     driver = new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\vijay\\eclipse-workspace\\Maven_Project\\Driver\\chromedriver.exe");
		 driver = new FirefoxDriver();
	} 

		else
		{
			System.out.println("invalid");	
		}
		
		driver.manage().window().maximize();
		return driver;	
	}
	
	//Launch URL
	
	public static void launchUrl(String url) {
		driver.get(url);
	}
		//sendkeys
	
	public static void sendValues(WebElement element,String value) {
		
		//element.sendkeys("kaveriraj07@gmail.com")
		
		element.sendKeys(value);
	}
			
	public static void clickOnElement(WebElement element) {
		element.click();
	}
	
	//screenshot method
	public static void printScreen() throws IOException {		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\vijay\\eclipse-workspace\\Maven_Project\\ScreenShot/pic12.png");
		FileUtils.copyFile(source, dest);
	}	
	
	//close method
	public static void closeWindow() {

		driver.close();

	}
	//quit window
	
	public static void quitwindow() {
		driver.quit();
	}
	
	//navigate to
	
	public static void navigateto(String url) 
	{
		driver.navigate().to(url);

	}
	//navigate back
	
	public static void navigateBack() {
		driver.navigate().back();

	}
	//navigate refresh
	
	public static void RefreshPage() {

		driver.navigate().refresh();
	
	}
	//navigate forward
	public static void navigateForward() {
		driver.navigate().forward();
	}

	//single Dropdown
	public  static void SingleDropDown(WebElement element,String selectMethod,String value) {
		Select s = new Select(element);
		if(selectMethod.equalsIgnoreCase("value"))
		{
			s.selectByValue(value);
	}
	
		else if(selectMethod.equalsIgnoreCase("visible"))
		{
			s.selectByVisibleText(value);
		}
		else if(selectMethod.equalsIgnoreCase("index"))
		{
			int index = Integer.parseInt(value);//converting string into int
			s.selectByIndex(index);
		}
	}
	//is enabled
	
	public static void Enabled(WebElement element) {
		boolean Enable = element.isEnabled();
		System.out.println(Enable);
		
	}
	
	//is Selected
	
	public static void Selected(WebElement element) {
		
		boolean Select= element.isSelected();
		
		System.out.println(Select);	
	}
	//is displayed
	
	public static void displayed(WebElement element) {
		boolean multiple = element.isEnabled();
		System.out.println(multiple);
	}
	//is multipe
	
	private void multiple(WebElement element) {
		
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		

	}
	//getTittle
	
	public static void gettitle() {
		
		String title = driver.getTitle();
		System.out.println(title);

	}
	
	//get currentUrl
	
	public static void getcurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}
	
	//get text
	
	public static void getText(WebElement element) {
		
		String text = element.getText();
		
		System.out.println(text);
		

	}
	
	//wait
	
	public static void implicitWait() {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	
	//get options
	
	public static void getOption() {
		
		Select a = new Select(getOption);
		
		List<WebElement> alloptions = a.getOptions();
		
		for (int i = 0; i < alloptions.size(); i++) {
			
		System.out.println(alloptions.get(i).getText());
			
		}
	
	}

	//scroll
	
	public static void scroll(String scroll) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		if(scroll.equalsIgnoreCase("bottom"))
		{
			
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		}
		else if(scroll.equalsIgnoreCase("top"))
			
		{
			js.executeScript("window.scroll(0,0)", "");
			
			
		}
		else if(scroll.equalsIgnoreCase(" postion"))
			
			{
			js.executeScript("window.scroll(0,500)", "");
		
			
		}
	}
		
		
		

	}





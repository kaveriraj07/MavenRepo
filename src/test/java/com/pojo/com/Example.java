package com.pojo.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.Maven_Project.BaseClass;

public class Example extends BaseClass {
	
private static WebElement Options;

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\eclipse-workspace\\Selinium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		WebElement multidrop = driver.findElement(By.xpath("(//select)[6]"));
		
		Select a = new Select(multidrop);
		
		a.selectByValue("2");
		a.selectByVisibleText("Loadrunner");
		a.selectByValue("1");
		
		a.deselectByVisibleText("Selenium");
		
		/*List<WebElement> alloptions = a.getOptions();
		
		for (int i = 0; i < alloptions.size(); i++) {
			
			System.out.println(alloptions.get(i).getText());
			
		}*/
		
		
		getOption();
		
		
		a.deselectAll();
	}


}

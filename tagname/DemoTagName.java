package com.selenium.testcases.tagname;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTagName {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", ".//BrowserDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String url = "https://www.w3schools.com/xml/xpath_syntax.asp";

		// open application
		driver.get(url);
		
		
		List<WebElement> li = driver.findElements(By.tagName("a"));
		
		System.out.println(li.size());
		
		//print all links
//		assignment for you
		
		
	}
	
	
}

package com.selenium.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyDashboardpage {
	
	
	public static void main(String[] args) {
		
		//open browser		
		System.setProperty("webdriver.chrome.driver", ".//BrowserDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String url = "https://opensource-demo.orangehrmlive.com";
		String loginName = "Admin";
		String loginPwd = "admin123";
		
		//xpath for login page
		String loginName_xpath = "//input[@name='txtUsername']";
		String loginPwd_xpath = "//input[@type='password']";
		String loginBtn_xpath = "//input[@value='LOGIN']";
				
		//xpath for dashboard page
		String dashboardLabel_xpath = "//h1";
		String PIMTab_xpath = "//a[@id='menu_pim_viewPimModule']";
		
		//xpath for PIM page
		String PIM_label_xpath = "//h1"; 
		
		
		//open application
		driver.get(url);
		
		//enter user name
		driver.findElement(By.xpath(loginName_xpath)).sendKeys(loginName);
		
		//enter password
		driver.findElement(By.xpath(loginPwd_xpath)).sendKeys(loginPwd);
		
		
		//click login button
		driver.findElement(By.xpath(loginBtn_xpath)).click();
		
		
		//get "Dashboard" label
		String dashboardLabel = driver.findElement(By.xpath(dashboardLabel_xpath)).getText();
		System.out.println("dashboardLabel value : "+ dashboardLabel);
		
		
		//click PIM Tab
		driver.findElement(By.xpath(PIMTab_xpath)).click();
		
		
		String PIMTab_Label = driver.findElement(By.xpath(PIM_label_xpath)).getText();
		System.out.println("PIMTab_Label value : "+PIMTab_Label);
		
		
		
		
		
		
		
		
	}

}

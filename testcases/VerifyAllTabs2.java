package com.selenium.testcases;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class VerifyAllTabs2 {
	public static void main(String[] args) {
		// open browser
		System.setProperty("webdriver.chrome.driver", ".//BrowserDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://opensource-demo.orangehrmlive.com";
		String loginName = "Admin";
		String loginPwd = "admin123";
		// xpath for login page
		String loginName_xpath = "//input[@name='txtUsername']";
		String loginPwd_xpath = "//input[@type='password']";
		String loginBtn_xpath = "//input[@value='LOGIN']";
		// xpath for dashboard page
		String dashboardLabel_xpath = "//h1";
		String PIMTab_xpath = "//a[@id='menu_pim_viewPimModule']";
		// open application
		driver.get(url);
		// enter user name
		driver.findElement(By.xpath(loginName_xpath)).sendKeys(loginName);
		// enter password
		driver.findElement(By.xpath(loginPwd_xpath)).sendKeys(loginPwd);
		// click login button
		driver.findElement(By.xpath(loginBtn_xpath)).click();
		// get "Dashboard" label
		String dashboardLabel = driver.findElement(By.xpath(dashboardLabel_xpath)).getText();
		System.out.println("dashboardLabel value : " + dashboardLabel);
		// get all tabs count
		List<WebElement> li = driver.findElements(By.xpath("//div[@id='mainMenu']/ul/li"));
		System.out.println(li.size());
		// click on each tab - Navigate to each tab
		for (int i = 1; i <= li.size(); i++) {
			driver.findElement(By.xpath("//div[@id='mainMenu']/ul/li[" + i + "]")).click();
			String H1Tag = driver.findElement(By.xpath("//h1")).getText();
			System.out.println("Label : " + H1Tag);
		}
	}
}

//print all tab name?
//navigate to each tab print the label



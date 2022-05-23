package com.selenium.testcases.list;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoList2 {

	public static void main(String[] args) throws InterruptedException {
		// open browser
		System.setProperty("webdriver.chrome.driver", ".//BrowserDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers";

		driver.get(url);

		// login page xpath
		String uname_xpath = "//input[@name='txtUsername']";
		String pwd_xpath = "//input[@type='password']";
		String loginBtn_xpath = "//input[@value='LOGIN']";

		// dashboard xpath
		String dashboardLabel_xpath = "//h1";

		// test data to login as admin user
		String username = "Admin";
		String password = "admin123";

		// enter user name
		driver.findElement(By.xpath(uname_xpath)).sendKeys(username);
		// enter password
		driver.findElement(By.xpath(pwd_xpath)).sendKeys(password);
		// click login
		driver.findElement(By.xpath(loginBtn_xpath)).click();

		List<String> tabNames = new ArrayList<>();
		System.out.println(tabNames);

		List<WebElement> tab_List = driver.findElements(By.xpath("//div[@id='mainMenu']/ul/li/a/b"));
		
		
		
		// find
		for (int i = 1; i <= tab_List.size(); i++) {
			String tab = driver.findElement(By.xpath("//div[@id='mainMenu']/ul/li[" + i + "]/a/b")).getText();
			
			tabNames.add(tab);

		}
		System.out.println(tabNames);

	}

}

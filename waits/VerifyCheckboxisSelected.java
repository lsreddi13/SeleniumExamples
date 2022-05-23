package com.selenium.testcases.waits;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//it is verifying the check box is selected or not 
public class VerifyCheckboxisSelected {
	static WebDriver driver;

	public static void main(String[] args) {
		try {
			try {

				// open browser
				System.setProperty("webdriver.chrome.driver", ".//BrowserDrivers//chromedriver.exe");
				driver = new ChromeDriver();

			} catch (Exception e) {
				System.out.println("driver not initialized.. it might be path error.");
			}
			WebDriverWait wait = new WebDriverWait(driver, 10);

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
			driver.manage().window().maximize();
			try {

				// enter user name
				driver.findElement(By.xpath(loginName_xpath)).sendKeys(loginName);
				// enter password
				driver.findElement(By.xpath(loginPwd_xpath)).sendKeys(loginPwd);
				// click login button
				driver.findElement(By.xpath(loginBtn_xpath)).click();

				// get "Dashboard" label
				String dashboardLabel = driver.findElement(By.xpath(dashboardLabel_xpath)).getText();
				System.out.println("dashboardLabel value : " + dashboardLabel);
			} catch (Exception e) {
				System.out.println("error at user login section." + e);
			}
//		click admin tab
			try {

				wait.until(ExpectedConditions.elementToBeClickable(By.id("menu_admin_viewAdminModule")));
				driver.findElement(By.id("menu_admin_viewAddminModule")).click();
			} catch (NullPointerException e) {
				System.out.println("drier is not available +++++++++++++" + e);
			} catch (NoSuchElementException e) {
				System.out.println("web element is not present *********" + e);
			} catch (StaleElementReferenceException e) {
				System.out.println("stale element exception. @@@@@@@@@@" + e);
			}
			WebElement deleteBtn = driver.findElement(By.id("btnDelete"));

//		driver.navigate().refresh();
			boolean value1 = deleteBtn.isEnabled();

			System.out.println("Is deelte button clickable ? " + value1);

			WebElement checkBox = driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_53']"));
			boolean checkboxValue = checkBox.isSelected();
			System.out.println("before select check box, check box is selected or not ? " + checkboxValue);
			if (checkboxValue == true) {
				System.out.println("already selected.");
			} else {
				System.out.println("check box is not selected. I am going to select now");
				checkBox.click();
			}

			boolean checkboxValue2 = checkBox.isSelected();
			System.out.println("after select check box, check box is selected or not ? " + checkboxValue2);

			boolean deleteBtnValue = deleteBtn.isEnabled();
			System.out.println("Is deelte button clickable ? " + deleteBtnValue);
		} catch (NullPointerException e) {
			System.out.println("drier is not available " + e);
		} catch (NoSuchElementException e) {
			System.out.println("web element is not present" + e);
		} catch (StaleElementReferenceException e) {
			System.out.println("stale element exception." + e);
		}
	}
}

//print all tab name?
//navigate to each tab print the label

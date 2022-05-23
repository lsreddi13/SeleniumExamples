package com.selenium.testcases.waits;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoWaits {
	public static void main(String[] args) throws InterruptedException {

		// open browser
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//BrowserDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

		String url = "https://www.facebook.com/";
		driver.get(url);

		WebElement createAccountBtn = driver.findElement(By.xpath("//*[contains(text(), 'Create New Account')]"));

		if (createAccountBtn.isDisplayed() == true) {
			createAccountBtn.click();
		}

		WebDriverWait wait = new WebDriverWait(driver, 10);
//		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@name='birthday_month']")));

		/*
		 * WebElement month =
		 * driver.findElement(By.xpath("//select[@name='birthday_month']"));
		 * if(month.isDisplayed()==true) { month.click(); }
		 */

		WebElement f_Radio = driver.findElement(By.xpath("//span[@data-name='gender_wrapper']/span[1]/input"));

		boolean value2 = f_Radio.isSelected();

		System.out.println("female radio button is selected ? : " + value2);

		f_Radio.click();
		System.out.println("female radio button clicked.");
		boolean value3 = f_Radio.isSelected();

		System.out.println("female radio button is selected ? : " + value3);

//		.isDisplayed()
//		.isSelected()
//		.isEnabled()

	}
}

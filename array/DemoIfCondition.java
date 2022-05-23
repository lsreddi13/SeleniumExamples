package com.java.array;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class DemoIfCondition {
	static String url = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";

	public static void main(String[] args) {

		// chrome or firefox or edge
		String browserName = "chrome";
		if (browserName.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", ".//BrowserDrivers//chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			driver.get(url);

		} else if (browserName.equalsIgnoreCase("opera")) {

			System.setProperty("webdriver.opera.driver", ".//BrowserDrivers//operadriver.exe");
			WebDriver driver2 = new OperaDriver();

			driver2.get(url);
		} else {
			System.out.println("no browser name given");
		}
	}

}

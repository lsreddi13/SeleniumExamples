package com.java.array;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class DemoSwitch {
	static String url = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
	static WebDriver driver;

	public static void main(String[] args) {

		String browser = "chrome";
		switch (browser) {
		case "chrome":
			System.out.println("open chrome");
			System.setProperty("webdriver.chrome.driver", ".//BrowserDrivers//chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "opera":
			System.out.println("open opera");
			System.setProperty("webdriver.opera.driver", ".//BrowserDrivers//operadriver.exe");
			driver = new OperaDriver();
			break;
		default:
			System.out.println("no browser name has given so we are using default browser as chrome");
			System.setProperty("webdriver.chrome.driver", ".//BrowserDrivers//chromedriver.exe");
			driver = new ChromeDriver();
		}

		driver.get(url);
		// Outputs "Looking forward to the Weekend"

	}

}

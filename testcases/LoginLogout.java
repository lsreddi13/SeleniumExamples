package com.selenium.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class LoginLogout {
	static String url = "https://opensource-demo.orangehrmlive.com/"; // local variable
	static WebDriver driver; //

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\Downloads\\chromedriver_win32 (8)\\chromedriver.exe");
		driver = new ChromeDriver(); // open the browser

		driver.get(url);
		LoginLogout obj = new LoginLogout();

		obj.login_Logout("Admin", "admin123");

		obj.login_Logout("Admin", "admin123");
		driver.close();
	}

	public void login_Logout(String loginName, String loginpwd) throws InterruptedException {
		enterUserName(loginName);
		enterPwd(loginpwd);
		clickLoginBtn();
		clickWelcomeLink();
		clickLogout();

	}

	public void enterUserName(String x) {
		WebElement userName = driver.findElement(By.id("txtUsername"));// xpath
		userName.clear();
		userName.sendKeys(x);
	}

	public void enterPwd(String y) {
		WebElement pwd = driver.findElement(By.name("txtPassword"));
		pwd.clear();
		pwd.sendKeys(y);
	}

	public void clickLoginBtn() throws InterruptedException {
		WebElement loginBtn = driver.findElement(By.className("button"));
		loginBtn.click();
		Thread.sleep(3000);
	}

	public void clickWelcomeLink() throws InterruptedException {
		WebElement welcomeLink1 = driver.findElement(By.id("welcome"));
		welcomeLink1.click();
		Thread.sleep(3000);
	}

	public void clickLogout() throws InterruptedException {
		WebElement logoutLink = driver.findElement(By.linkText("Logout"));
		logoutLink.click();
		Thread.sleep(3000);
	}

}

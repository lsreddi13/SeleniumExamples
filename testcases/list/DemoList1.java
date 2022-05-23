package com.selenium.testcases.list;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoList1 {
	
	public static void main(String[] args) throws InterruptedException {
		// open browser
				System.setProperty("webdriver.chrome.driver", ".//BrowserDrivers//chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				String url = "https://www.facebook.com/";
				
				driver.get(url);
				

				//click create account 
				
				driver.findElement(By.xpath("//a[contains(text(), 'Create New Account')]")).click();
				Thread.sleep(2000);
				
				
				List<WebElement> li = driver.findElements(By.xpath("//select[@name='birthday_month']/option"));
				
				System.out.println("month count : "+ li.size());
				
//				boolean apr_month_exist = li.contains("Apr");
//				System.out.println(apr_month_exist);
				List li2 = new ArrayList();
				for (WebElement we : li) {
					System.out.println(we.getText());
						we.click();
						Thread.sleep(3000);
						li2.add(we.getText());
				}
				
				
				System.out.println(li2);
				
				System.out.println("Apr month exists : "+ li2.contains("Apr"));
				
	}
	

}

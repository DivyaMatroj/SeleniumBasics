package com.tutorials.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasics {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe");
		// instantiating the chrome driver
		driver = new ChromeDriver();
		// fecting the url with get(url method)
		driver.get("https://www.amazon.in/");
		// fetching the url with navigate to method
		// driver.navigate().to("https://www.amazon.in/");
		// closing the browser
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		
		
		driver.findElement(By.xpath("//a[text()=\"Mobiles\"]")).click();
		System.out.println("title of navigated page is"+driver.getTitle());
		driver.navigate().refresh();
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		
		
		driver.quit();
	}

}

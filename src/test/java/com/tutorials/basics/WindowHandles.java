package com.tutorials.basics;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WindowHandles {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe");
		// instantiating the chrome driver
		driver = new ChromeDriver();
		driver.get("https://amazon.in/");
		driver.manage().window().maximize();
		String originalwindow =driver.getWindowHandle();
		//assert driver.getWindowHandles().size()==1;
		/*
		 * driver.findElement(By.xpath("//a[text()=\"Mobiles\"]")).click();
		 * WebDriverWait wait = new WebDriverWait(driver, 10);
		 * wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		 */
		driver.findElement(By.xpath("//a[text()=\"Mobiles\"]")).click();
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		
		
		
		
		
		driver.quit();
	}
		                                                                                                                                                                                                                                                    }

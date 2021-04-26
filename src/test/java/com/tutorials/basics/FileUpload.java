package com.tutorials.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='file']/preceding-sibling::input"))
		.sendKeys("C:\\Users\\my\\Desktop\\Selenium Questions.docx");
	}
	
}

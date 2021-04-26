package com.tutorials.basics;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadAutoIT  {

	
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\90chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='file']/preceding-sibling::input")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\my\\Desktop\\autoit\\uploader.exe");
		
	}
	
}

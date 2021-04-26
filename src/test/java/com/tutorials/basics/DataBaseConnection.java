package com.tutorials.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mysql.jdbc.*;

public class DataBaseConnection {
	static WebDriver driver;
public static void main(String args[]) throws Exception {
	
	Connection con = null;
	Statement stmt =null;
	ResultSet rs = null;
	String username = null;
	String pwd = null;
	
	System.setProperty("webdriver.chrome.driver", "C:\\90chrome\\chromedriver.exe");
	// instantiating the chrome driver
	
	
	Class.forName("com.mysql.jdbc.Driver");
	
	con =DriverManager.getConnection("jdbc:mysql://localhost:3036/database1","root","divya@999");
	
	
	rs=stmt.executeQuery("select * from login_details");
	
	while(rs.next()) {
		
		username=rs.getString("username");
		pwd = rs.getString("pwd");
		}
	
driver = new ChromeDriver();
	
	driver.get("https://facebook.com");
	
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(pwd);
	
	driver.findElement(By.xpath("//button[@name='login']"));
	
	System.out.println(username +"is successfullly logged into facebook !!!");
	
	
	
	
	
}
}

package com.tutorials.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
 import org.openqa.selenium.WebDriver;


public class SeleniumDBConnection {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe");
		// instantiating the chrome driver
		//driver = new ChromeDriver();
		
		
				

		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","divyamatroj","divya@999");
		Statement stmt = con.createStatement();
		
		 ResultSet rs = stmt.executeQuery("SELECT username,password FROM \"LoginDetails\"");
		 String username = null;
		 String password = null;
		 while(rs.next()) {
			 
			 username=rs.getString("username");
			 password=rs.getString("password");
			 
		 }
		 
		 System.out.println("connection successful");
		 System.out.println("username and password :"+username+":"+password);
		
		
			/*
			 * driver.get("https://www.facebook.com/");
			 * 
			 * driver.findElement(By.xpath("//input[@id='email']"))
			 * driver.findElement(By.xpath("//input[@id='pass']"))
			 * 
			 * driver.findElement(By.xpath("//button[@name='login']")).click();
			 */
		
}
}
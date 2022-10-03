package com.simplilearn.com;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class login {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\heman\\eclipse-phase5-class\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.shine.com/login/");
		
		
		
		
		
		//email
		WebElement email= driver.findElement(By.id("id_email_login"));
		email.sendKeys("hemanthsomisetty222@gmail.com");
		
		
		//password
		WebElement password= driver.findElement(By.id("id_password"));
		password.sendKeys("Hemu@9632");
		
		//button
		WebElement login= driver.findElement(By.cssSelector("#cndidate_login_widget"));
		login.click();
}
}
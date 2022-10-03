package com.test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class RegisterTest {
	WebDriver edge;
	  @Test(priority = 1)
	  public void register() {
		  
		  edge.get("http://automationpractice.com/index.php");
		  WebElement registerbtn= edge.findElement(By.className("login"));
		  registerbtn.click();
		  WebElement email= edge.findElement(By.id("email_create"));
		  email.sendKeys("hemu15@gmail.com");
		  WebElement create= edge.findElement(By.id("SubmitCreate"));
		  create.click();
		  
		  edge.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		  
		  WebElement title = edge.findElement(By.cssSelector("label[for='id_gender1']"));
		  title.click();
		  
		  WebElement firstName = edge.findElement(By.id("customer_firstname"));
		  firstName.sendKeys("hemanth");
		  WebElement lastName = edge.findElement(By.id("customer_lastname"));
		  lastName.sendKeys("somisetty");
		  WebElement password = edge.findElement(By.name("passwd"));
		  password.sendKeys("testing");
		  
		  Select day= new Select(edge.findElement(By.id("days")));
		  day.selectByValue("27");
		  Select month= new Select(edge.findElement(By.id("months")));
		  month.selectByValue("8");
		  Select year= new Select(edge.findElement(By.id("years")));
		  year.selectByValue("2000");
		  
		 
		  WebElement add = edge.findElement(By.id("address1"));
		  add.sendKeys("badvel");
		  WebElement city = edge.findElement(By.id("city"));
		  city.sendKeys("kadapa");
		  
		  Select state= new Select(edge.findElement(By.id("id_state")));
		  state.selectByValue("14");
		  
		  WebElement postcode = edge.findElement(By.id("postcode"));
		  postcode.sendKeys("51622");
		  WebElement phno = edge.findElement(By.id("phone_mobile"));
		  phno.sendKeys("9848283858");
		  
		  WebElement acsubmit = edge.findElement(By.id("submitAccount"));
		  acsubmit.click();
		  
		  WebElement logoutbtn = edge.findElement(By.className("logout"));
		  logoutbtn.click();
		  
		  
	

		  }
	  
	  
	  	@Test(priority = 2)
	  public void login()
	  {
	  		edge.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  		 edge.get("http://automationpractice.com/index.php");
			  WebElement btn= edge.findElement(By.className("login"));
			  btn.click();
			  
			  WebElement email= edge.findElement(By.id("email"));
			  email.sendKeys("hemu15@gmail.com");
			  
			  WebElement password= edge.findElement(By.id("passwd"));
			  password.sendKeys("testing");
			  
			  
			  WebElement login= edge.findElement(By.id("SubmitLogin"));
			  login.click();
			  System.out.println(edge.getCurrentUrl());
			  assertEquals(edge.getCurrentUrl(), "http://automationpractice.com/index.php?controller=my-account","Invalid credentials");
//			  assertEquals(edge.getCurrentUrl(), "http://automationpractice.com/index.php?controller=my-account", " Success ");
			
			  
			  
			  
	  }
	  	
	  	@Test(priority = 3)
	  	public void search()
	  	{
	  		
	  		edge.findElement(By.id("search_query_top")).sendKeys("shirt");
	  		edge.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  		edge.findElement(By.name("submit_search")).click();
	  	}
	  	
	  	@Test(priority = 4)
	  	public void addToCart()
	  	
	  	{
	  		
	  		
	  		edge.get("http://automationpractice.com/index.php?id_product=1&controller=product&search_query=shirt&results=1");
	  		edge.findElement(By.name("Submit")).click();
//	  		edge.findElement(By.className("product-name")).click();
	  	}
	  
	  @BeforeMethod
	  public void beforeMethod() {
		  edge.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  }

	  @AfterMethod
	  public void afterMethod() {
	  }
	  
	  @BeforeClass
	  public void beforeClass() {
		  System.setProperty("webdriver.edge.driver", "C:\\Users\\heman\\eclipse-phase5-class\\msedgedriver.exe");
		  edge = new EdgeDriver();
		  edge.manage().window().maximize();
	  }
	  
	  @AfterClass
	  public void afterClass() {
		  
	  }
	  

}

package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testing {
	
	WebDriver driver;
	 @BeforeMethod
	    public void startbrowser()
	    {
		  
		  	 driver = new ChromeDriver();
		  	 
		  	driver.manage().window().maximize();
		  	
	      driver.get("https://www.amazon.in/");
	      
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      	
	      	   
	    }
	 @Test(priority = 1)
	  public void register() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		 
		driver.findElement(By.id("nav-link-accountList")).click();
		Thread.sleep(5000);
	      driver.findElement(By.id("createAccountSubmit")).click();
	      Thread.sleep(5000);
	      driver.findElement(By.id("ap_customer_name")).sendKeys("admin");
	      Thread.sleep(5000);
	      driver.findElement(By.id("ap_email")).sendKeys("admin@gmail.com");
	      Thread.sleep(5000);
	      driver.findElement(By.id("ap_password")).sendKeys("password");
	      Thread.sleep(5000);
	      driver.findElement(By.id("ap_password_check")).sendKeys("password");
	      Thread.sleep(5000);
	     driver.findElement(By.id("continue")).click();
	}
     @Test(priority = 2)
	  public void login() throws InterruptedException {
		
		

		 driver.findElement(By.id("nav-link-accountList")).click();
		 Thread.sleep(5000);
	     driver.findElement(By.id("ap_email")).sendKeys("admin@gmail.com");
	     Thread.sleep(5000);
		  driver.findElement(By.id("continue")).click();
		  Thread.sleep(5000);
	     driver.findElement(By.id("ap_password")).sendKeys("password");
	       


	  }
     @Test(priority = 3)
	  public void addToCart() throws InterruptedException {
		  
	      	
		    System.out.println(driver.getTitle());
		    System.out.println(driver.getCurrentUrl());
		    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("watch");
		    Thread.sleep(5000);
		    driver.findElement(By.id("nav-search-submit-button")).submit();
		    Thread.sleep(5000);
		    driver.findElement(By.xpath("//*[contains(@src,'https://m.media-amazon.com/images/I/71gjvIjO4ZL._AC_UL320_.jpg')]")).click();
		    Thread.sleep(5000);
		   
		   
	  }
     @AfterMethod
	    public void closeBrowser()
	    {
	        driver.close();
	    }

}

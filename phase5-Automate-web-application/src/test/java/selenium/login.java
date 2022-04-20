package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/tekijaswanthmph/Downloads/chromedriver");

WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:UserLogin&returnto=Special%3ASearch&returntoquery=search%3D%26go%3DGo");
        Thread.sleep(5000);
		driver.findElement(By.id("wpName1")).sendKeys("admin");
        Thread.sleep(5000);

		driver.findElement(By.id("wpPassword1")).sendKeys("password");
        Thread.sleep(5000);

		driver.findElement(By.id("wpLoginAttempt")).click();
	}

	}



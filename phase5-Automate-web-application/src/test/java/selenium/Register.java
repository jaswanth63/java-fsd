package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/tekijaswanthmph/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Special:Search&returntoquery=search%3D%26go%3DGo&campaign=loginCTA");
    	driver.findElement(By.name("wpName")).sendKeys("admin");
    	driver.findElement(By.name("wpPassword")).sendKeys("password");
    	driver.findElement(By.name("retype")).sendKeys("password");
    	driver.findElement(By.name("email")).sendKeys("admin@gmail.com");
    	driver.findElement(By.name("wpCreateaccount")).click();





	}

}

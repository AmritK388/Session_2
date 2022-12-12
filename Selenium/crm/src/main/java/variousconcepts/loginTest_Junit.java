package variousconcepts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginTest_Junit {

	WebDriver driver;
		// TODO Auto-generated method stub
		@Before
		public  void launchBrowser() {	
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","");
			//System.setProperty("webdriver.chrome.driver","driver/chromedriver");
			//System.setProperty("webdriver.chrome.driver","./driver/chromedriver");
			 driver = new ChromeDriver();
			//go to url
			driver.get("https://www.techfios.com/portal/login");
			
			//clear cookies
			driver.manage().deleteAllCookies();
			//maximize window
			driver.manage().window().maximize();
			//apply implicitly wait
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}	
		@Test
		public  void loginTest() {
			//identify user name and password 
			driver.findElement(By.id("form_username_email")).sendKeys("amritpalkaur388@gmail.com");
			driver.findElement(By.id("form_password")).sendKeys("Amrit94..");
			//identify sign in button and click
			driver.findElement(By.name("btn_login")).click();
		}
		@Test
		public  void NegativeTest() {
			//identify user name and password 
					driver.findElement(By.id("form_username_email")).sendKeys("amritpalkaur388@gmail.com");
					driver.findElement(By.id("form_password")).sendKeys("Amrit94465");
					//identify sign in button and click
					driver.findElement(By.name("btn_login")).click();
		}
		@After
		public  void teardown() {
			//close browser
			driver.close();
		
	}

}

package variousconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginTest {
	static WebDriver driver;
	public static void main(String[] args) {
		
			launchBrowser();
			loginTest();
			teardown();
		
			launchBrowser();
			NegativeTest();
			teardown();
	}
		
	public static void launchBrowser() {	
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/Amrit/Selenium/crm/driver/chromedriver");
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
	public static void loginTest() {
		//identify user name and password 
		driver.findElement(By.id("form_username_email")).sendKeys("amritpalkaur388@gmail.com");
		driver.findElement(By.id("form_password")).sendKeys("Amrit94..");
		//identify sign in button and click
		driver.findElement(By.name("btn_login")).click();
	}
	public static void NegativeTest() {
		//identify user name and password 
				driver.findElement(By.id("form_username_email")).sendKeys("amritpalkaur388@gmail.com");
				driver.findElement(By.id("form_password")).sendKeys("Amrit94465");
				//identify sign in button and click
				driver.findElement(By.name("btn_login")).click();
	}
	
	public static void teardown() {
		System.out.println("after anotation");
		//close browser
		driver.close();
	}
}



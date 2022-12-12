package variousConcepts;


import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {

	WebDriver driver;
	@Before
	public void init() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/Amrit/Selenium/Session_2/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://objectspy.space");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}	
	@Test
	public void testlocators() {
		
		driver.findElement(By.name("firstname")).sendKeys("selenium");
		driver.findElement(By.id("sex-1")).click();
		driver.findElement(By.id("photo")).sendKeys("/Users/Amrit/Downloads/Info.txt");
		//driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		//driver.findElement(By.partialLinkText("OS-API")).click();
		driver.findElement(By.cssSelector("input#exp-6")).click();
		driver.findElement(By.cssSelector("input[name='tool'][value='Selenium Webdriver']")).click();
		driver.findElement(By.cssSelector("a[href$='http://www.objectspy.space']")).click();

	}
}

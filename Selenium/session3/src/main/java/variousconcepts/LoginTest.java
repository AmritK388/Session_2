package variousconcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class LoginTest {
	
	WebDriver driver;
	
	@Before
	public void init() {

		System.out.println("before anotation");
		System.setProperty("webdriver.chrome.driver", "/Users/Amrit/Selenium/session3/driver/chromedriver");
		driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.get("https://techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@Test
	public void loginTest() {
		
		//store web element
		//type name = value
		//Element List/lib
		WebElement USER_NAME_ELEMENT = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		WebElement PASSWORD_ELEMENT = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		WebElement SIGNIN_BUTTON_ELEMENT = driver.findElement(By.xpath("/html/body/div/div/div/form/div[3]/button"));
		
		
		//saving elements on BY class
		By USER_NAME_FIELD = By.xpath("//*[@id=\"username\"]");
		By PASSWORD_FIELD = By.xpath("//*[@id=\"password\"]");
		By SIGNIN_BUTTON_FIELD = By.xpath("/html/body/div/div/div/form/div[3]/button");
		By DASHBOARD_HEADER_FIELD = By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/h2");
		
		USER_NAME_ELEMENT.clear();
//		USER_NAME_ELEMENT.sendKeys("demo@techfios.com");
		driver.findElement(USER_NAME_FIELD).sendKeys("demo@techfios.com");
		driver.findElement(PASSWORD_FIELD).sendKeys("abc123");
		driver.findElement(SIGNIN_BUTTON_FIELD).click();
		
		boolean pageTitleDisplayStatus;
		try {
			WebElement DASHBOARD_HEADER_ELEMENT = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/h2"));
			pageTitleDisplayStatus = true;
		}catch(Exception e) {
			pageTitleDisplayStatus = false;
			e.printStackTrace();
		}
			
		
		/*WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(DASHBOARD_HEADER_FIELD));*/
		
		
		//Assert.assertTrue("Dashboard page not found!!", DASHBOARD_HEADER_ELEMENT.isDisplayed());
		Assert.assertTrue("Dashboard page not found!!", pageTitleDisplayStatus);
		
	}
}
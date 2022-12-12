package variousConcepts;



import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assignmemt2 {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/Amrit/Selenium/session2/driver/chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//input[@value='user']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.id("okayBtn")).click();
		
		WebElement staticDropdown = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(2);
		
		driver.findElement(By.id("terms")).click();
		
		driver.findElement(By.id("signInBtn")).click();
		
		String[] itemsNeeded = {"iphone X, Samsung Note 8, Nokia Edge, Blackberry"};
	
		addItems(driver,itemsNeeded);
	}

	public static void addItems(WebDriver driver, String[] itemsNeeded) throws InterruptedException {
		// TODO Auto-generated method stub
	
		WebDriverWait w = new WebDriverWait(driver,5);

		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h4.card-title")));
		Thread.sleep(3000);
		List <WebElement> products = driver.findElements(By.cssSelector("h4.card-title"));
		for(int i=0;i<products.size();i++)
		{
			String name=products.get(i).getText();
			
			if(name.contains("iphone X, Samsung Note 8, Nokia Edge, Blackberry"));
			{
				driver.findElements(By.cssSelector("button.btn.btn-info")).get(i).click();
				//driver.findElement(By.cssSelector("button.btn.btn-success")).click();
		
			
			}
			
			//driver.findElement(By.linkText("a.nav-link.btn.btn-primary")).click();

	}
		WebDriverWait w1 = new WebDriverWait(driver,5);
		w1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.nav-link.btn.btn-primary")));
		
		driver.findElement(By.cssSelector("a.nav-link.btn.btn-primary")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("button.btn.btn-success")).click();
		
		driver.findElement(By.cssSelector("input.btn.btn-success.btn-lg")).click();


		}	
}


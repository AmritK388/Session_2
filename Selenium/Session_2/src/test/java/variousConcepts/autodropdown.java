package variousConcepts;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autodropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/Amrit/Selenium/Session_2/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement> grid = driver.findElements(By.cssSelector("li[class='ui-menu-item'] div"));
		System.out.println(grid);
		for(WebElement option : grid)
		{
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();
				break;
			}
		}
	}
//*	WebDriver driver = new ChromeDriver();

  //  driver.get("http://qaclickacademy.com/practice.php");

  //  driver.findElement(By.id("autocomplete")).sendKeys("ind");

 //   Thread.sleep(2000);

 //   driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

  //  driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

  // System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value")); 

       
}
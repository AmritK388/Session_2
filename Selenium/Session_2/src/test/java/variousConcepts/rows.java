package variousConcepts;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/Amrit/Selenium/Session_2/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://qaclickacademy.com/practice.php");
		
		WebElement rows = driver.findElement(By.xpath("//*[@id=\"product\"]"));
		List<WebElement> tables = rows.findElements(By.tagName("tr"));
		System.out.println(tables.size());
		
		System.out.println (rows.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
		
		System.out.println(driver.findElement(By.cssSelector(".table-display tr:nth-child(3)")).getText());
		
	}
	
}


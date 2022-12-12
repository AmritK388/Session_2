package variousConcepts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment {

	public static void main(String[] args) {
		

	
		
					
					// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/Amrit/Selenium/session2/driver/chromedriver");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.name("name")).sendKeys("Amrit");
		driver.findElement(By.name("email")).sendKeys("amrit388@yahoo.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("hell0123");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(1);
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("18/07/1994");
		driver.findElement(By.cssSelector(".btn-success")).click();
		driver.findElement(By.cssSelector("alert-success")).getText();
		
	}

}

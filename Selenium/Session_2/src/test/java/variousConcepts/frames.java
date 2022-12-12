package variousConcepts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/Amrit/Selenium/Session_2/drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/");
		//Actions a =new Actions(driver);
		driver.findElement(By.linkText("Nested Frames")).click();
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");

		System.out.println((driver.findElement(By.xpath("//*[@id=\"content\"]")).getText()));
		
	}

}

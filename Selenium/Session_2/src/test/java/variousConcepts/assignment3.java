package variousConcepts;


import java.util.Set;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment3 {
	

	   public static void main(String[] args) {

	// TODO Auto-generated method stub





	System.setProperty("webdriver.chrome.driver", "/Users/Amrit/Selenium/Session_2/drivers/chromedriver");

	WebDriver driver = new ChromeDriver();

	driver.get("https://the-internet.herokuapp.com/");
	driver.findElement(By.linkText("Multiple Windows")).click();
	driver.findElement(By.cssSelector("a[href*='/windows/new']")).click();
	Set<String> windows = driver.getWindowHandles(); //[parentid,childid,subchildId]

	Iterator<String>it = windows.iterator();
	String parentId = it.next();



	driver.switchTo().window(it.next());

	System.out.println(driver.findElement(By.className("example")).getText());
	
	driver.switchTo().window(parentId);
	System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3")).getText());

	//System.out.println(driver.findElement(By.cssSelector("div.example")).getText());

	//System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());

	//driver.findElement(By.cssSelector(".im-para.red")).getText();

	//String emailId= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];

	//driver.switchTo().window(parentId);

	//driver.findElement(By.id("username")).sendKeys(emailId);





















	}



	}


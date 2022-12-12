package variousConcepts;


import java.util.Iterator;

//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class assignment6 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "/Users/Amrit/Selenium/Session_2/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		String Element = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
		//Thread.sleep(3000);
	WebElement staticDropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
	Select dropdown = new Select(staticDropdown);
	dropdown.selectByVisibleText(Element);
	driver.findElement(By.id("name")).sendKeys(Element);
	//driver.findElement(By.id("alertbtn")).isSelected();
	driver.findElement(By.id("alertbtn")).click();

	String alert = driver.switchTo().alert().getText();
	if(alert.contains(alert ))
	{
		System.out.println("run was successfull");
		
		
	 }

    else

   System.out.println("It did not run successfully try again");

}

      


	}

//WebElement checkboxOptions = driver.findElement(By.id("checkbox-example"));
//WebElement selectedOption = checkboxOptions.findElement(By.cssSelector("fieldset label:nth-child(3)"));
//String optionText = selectedOption.getText();
//System.out.println(optionText);
//selectedOption.findElement(By.cssSelector("input[type='checkbox']")).click();

//Select dropdown = new Select(driver.findElement(By.id("dropdown-class-example")));
//dropdown.selectByVisibleText(optionText);

//Actions a = new Actions(driver);
//a.moveToElement(driver.findElement(By.id("name"))).click().keyDown(Keys.SHIFT).sendKeys(optionText).build().perform();
//a.moveToElement(driver.findElement(By.id("alertbtn"))).click().build().perform();

//Assert.assertTrue(driver.switchTo().alert().getText().contains(optionText.toUpperCase()));
//driver.quit();

   
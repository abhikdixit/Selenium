package training_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guru99_Login {
	private	WebDriver driver;
  @Test
  public void Login() {
	  
	  	driver.navigate().to("http://newtours.demoaut.com/mercurywelcome.php");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SIGN-ON")).click();
		driver.findElement(By.name("userName")).sendKeys("selenium");
		driver.findElement(By.name("password")).sendKeys("selenium");
		driver.findElement(By.name("loginn")).click();
		driver.quit();
  }
  
  @BeforeTest
  public void LaunchBrowser() {
	  	driver = new FirefoxDriver();
		
  }

  @AfterTest
  public void CloseBrowser() {
  	  driver.quit();
  }
}

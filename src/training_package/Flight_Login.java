package training_package;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flight_Login {
	private	ChromeDriver driver;	
	@Test
	public void Login() throws Exception
	{
		
 		driver.navigate().to("http://newtours.demoaut.com/mercurywelcome.php");
		//driver.manage().window().maximize();
		driver.findElement(By.linkText("SIGN-ON")).click();
		driver.findElement(By.name("userName")).sendKeys("selenium");
		driver.findElement(By.name("password")).sendKeys("selenium");
		driver.findElement(By.name("login")).click();
		/*driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElementByLinkText("SIGN-ON");*/
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement WaitElement = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("SIGN-OFF")));
		String strng = WaitElement.getText();
		System.out.println(strng);
		Assert.assertEquals("SIGN-OFF", strng);
	}

@Before
public void LaunchBrowser() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\adixit\\workspace\\Demo_CG\\chromedriver.exe");
	 driver = new ChromeDriver();
}

@After
public void CloseBrowser() {
	  driver.quit();
}
}

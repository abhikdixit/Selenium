package training_package;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Execute_JavaScript_Code {
	
	@Test		
    public void Login() 					
    {		
        WebDriver driver= new FirefoxDriver();			
        		
        //Creating the JavascriptExecutor interface object by Type casting		
        JavascriptExecutor js = (JavascriptExecutor)driver;		
        		
        //Launching the Site.		
        driver.get("http://demo.guru99.com/V4/");			
        driver.manage().window().maximize();	
        WebElement button =driver.findElement(By.name("btnLogin"));			
        		
        //Login to Guru99 		
        driver.findElement(By.name("uid")).sendKeys("mngr96675");					
        driver.findElement(By.name("password")).sendKeys("uzubUdy");					
        		
        //Perform Click on LOGIN button using JavascriptExecutor		
        js.executeScript("arguments[0].click();", button);
                                
        //To generate Alert window using JavascriptExecutor. Display the alert message 			
       //js.executeScript("alert('Welcome to Guru99');");   
        
        //Method document.title fetch the Title name of the site. Tostring() change object to name		
        String TitleName = js.executeScript("return document.title;").toString();			
        System.out.println("Title of the page = "+TitleName);	
    	driver.quit();	
    }		

}

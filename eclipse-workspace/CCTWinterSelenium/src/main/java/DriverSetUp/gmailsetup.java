package DriverSetUp;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class gmailsetup {

	
	static WebDriver driver;
	
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		
	System.setProperty("webdriver.chrome.driver","/Users/farhanaafaz/Downloads/chromedriver");
		
	driver = new ChromeDriver();	
		
		
	driver.get("https://www.google.com/intl/en-US/gmail/about/ ");	
		
	
		
		WebElement newAccount = driver.findElement(By.xpath("(//div[@class='dropdown__icon'])[2]"));
		
	
		newAccount.click();
		
		
		
		

	    WebDriverWait exWait = new WebDriverWait(driver,Duration.ofSeconds(5));  //explicit wait
	      
	    //WebDriver 
	    By firstName =( By.xpath("//input[@name='firstname']"));
	    
	    exWait.until(ExpectedConditions.visibilityOfElementLocated(firstName));
		  
		
	
	  WebElement newClick =	driver.findElement(firstName);
	

		newClick.click();
		
	}

}

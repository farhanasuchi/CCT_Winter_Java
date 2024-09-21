package DriverSetUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


// comment

public class ActionsFacebook {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		
		
		System.setProperty("webdriver.chrome.driver","/Users/farhanaafaz/Downloads/chromedriver");
		
		driver = new ChromeDriver();	
			
		driver.get("https://www.facebook.com/");
		
		
		
		Actions act = new Actions (driver);
		
	WebElement header = driver.findElement(By.xpath("//h2[text()='Connect with friends and the world around you on Facebook.']"));
		
		act.doubleClick(header);
	
		act.perform();
		
		
		
		Thread.sleep(3000);
		
		
WebElement textBox = driver.findElement(By.xpath("//input[@id='email']"));
		
		act.contextClick(textBox);
	
	    act.perform();
		
	    
	    
	    Thread.sleep(3000);
	    
	    
WebElement 	englishUS = driver.findElement(By.xpath("//Li[text()= 'English (US)']")) ;   
	    
	    
	    act.moveToElement(englishUS);
	    act.perform();
	    
	    
	    
	    
		
		
	}

}

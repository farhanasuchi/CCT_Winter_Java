package DriverSetUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {
   
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver","/Users/farhanaafaz/Downloads/chromedriver" );
		
		
		 driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			
		
		driver.switchTo().frame(0);
		
		
		
		
		WebElement loginBtn= driver.findElement(By.xpath("(//div[@class='login-btn'])[2]"));
		
		loginBtn.click();
		
		
		
		driver.switchTo().defaultContent();
		

		WebElement RadioBtn = driver.findElement(By.xpath("//label[@for='radio1']"));
		
		RadioBtn.click();   //its not work,we need another method for scroll up
		
		
	
		WebElement RESTAPI = driver.findElement(By.xpath("//a[text() = 'REST API']"));
		
		RESTAPI.click();
		
		
		
		
		
		
	}

}

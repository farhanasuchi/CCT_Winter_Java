package DriverSetUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindows {
	
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","/Users/farhanaafaz/Downloads/chromedriver" );
		
		
		 driver = new ChromeDriver();
		
		driver.get("https://cars.hotels.com/en-us/?clientID=541572#/searchcars	");
		
		
		WebElement GrpMeet = driver.findElement(By.xpath("//a[text()='Groups & Meetings']"));
		
		GrpMeet.click();
		
		
		
		
		for(String windowHandle : driver.getWindowHandles()) {
		
		driver.switchTo().window(windowHandle);
		
		}
		WebElement destText = driver.findElement(By.xpath("//input[@name='Destination1Text']"));
		
		destText.sendKeys("Dhaka");
		
		
			
	
		
		
		
		
		
	}

}

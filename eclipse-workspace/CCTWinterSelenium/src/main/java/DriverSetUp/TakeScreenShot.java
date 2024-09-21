package DriverSetUp;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShot {

   static WebDriver driver;
	
   public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
	   System.setProperty("webdriver.chrome.driver","/Users/farhanaafaz/Downloads/chromedriver" );
		
		
		 driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		TakesScreenshot tc = (TakesScreenshot) driver;
		
		
	File source =	tc.getScreenshotAs(OutputType.FILE);
		
	File dest = new File("data/screenShot00.png");
		
	
	FileHandler.copy(source, dest);
	
	
		
	}











}

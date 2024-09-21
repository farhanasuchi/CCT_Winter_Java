package DriverSetUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

   static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","/Users/farhanaafaz/Downloads/chromedriver" );
		
		
		 driver = new ChromeDriver();
		
		driver.get("file:/Users/farhanaafaz/Downloads/alert.html");
		
		
		
		//jQuery
		Thread.sleep(2000);
		WebElement jQuery = driver.findElement(By.xpath("//button[@id='html_alert']"));
		
		jQuery.click();
		
		
		
		
        Thread.sleep(2000);
		WebElement crossBtn = driver.findElement(By.xpath("//button[@type='button']"));
		
		crossBtn.click();
		
		
		//javaScript
		
		
		 Thread.sleep(2000);
			WebElement jscript = driver.findElement(By.xpath("//button[@id='js_alert']"));
			
			jscript.click();
		
			
		Thread.sleep(2000);	
     	Alert alt = driver.switchTo().alert();
			
		alt.accept();	  //accepts okay or yes
			
	//	alt.dismiss();	//accept cancel or no
		
	
	// String st = alt.getText();
		
	// System.out.println(st);	
		
		
		
	// alt.sendKeys("CodeCraftTech");	
		
		
		
		
		
		
	}

}

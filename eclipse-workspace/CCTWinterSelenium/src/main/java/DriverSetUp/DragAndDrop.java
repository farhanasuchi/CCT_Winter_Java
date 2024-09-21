package DriverSetUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


	
	System.setProperty("webdriver.chrome.driver","/Users/farhanaafaz/Downloads/chromedriver");
		
		driver = new ChromeDriver();	
			
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
		
	
	
	
	Actions act = new Actions (driver);
	
	
	WebElement source = driver.findElement(By.xpath("(//div[text()='Washington'])[2]"));
	
	
	WebElement target = driver.findElement(By.xpath("//div[text()='United States']"));
	
	
	act.dragAndDrop(source, target);
	act.perform();
	
	
	
    WebElement source2 = driver.findElement(By.xpath("(//div[text()='Rome'])[2]"));
	
	
	WebElement target2 = driver.findElement(By.xpath("//div[text()='Italy']"));
	
	
	act.dragAndDrop(source2, target2);
	act.perform();
	
	
	
	
	
	}

}

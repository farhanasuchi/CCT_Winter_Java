package DriverSetUp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SetUp {

	
	
	
	static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/farhanaafaz/Downloads/chromedriver" );
		
		
		 driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
	//	driver.navigate().to("https://www.facebook.com/");
		
		
    WebElement newAccount =	driver.findElement(By.xpath("(//a[@role='button'])[2]"))	;
	//String text = 	newAccount.getText();
   // System.out.println(text);
    
    newAccount.click();  //single click
	
    
    
	Thread.sleep(3000);
	
	WebElement  fName = driver.findElement(By.xpath("//input[@name='firstname']"));
	fName.clear();	    //to remove texts from textbox
	fName.sendKeys("Farhana");      //typing in the textbox
	
	
	
	WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
	lastname.sendKeys("Suchi");
	
	
	
	WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
	email.sendKeys("myemail@gmail.com");
	
	
	
	WebElement password = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
	password.sendKeys("abcde1234");
	
	
	//driver.close();   //for current tab
	//driver.quit();    //for entire browser
	//driver.manage().window().maximize();    // for maximizing windows
	
	
	//driver.navigate().back();
	//driver.navigate().forward();
	//driver.navigate().refresh();
	
	
	
	WebElement month = driver.findElement(By.xpath("//select[@aria-label='Month']"));
	
	Select obj = new Select(month);
	
	//obj.selectByIndex(10);
	//obj.selectByValue("11");
	obj.selectByVisibleText("Nov");
	
	
//String t = month.getText();
//System.out.println(t);



WebElement date = driver.findElement(By.xpath("//select[@aria-label='Day']"));

Select obj1 = new Select(date);

obj1.selectByVisibleText("11");




WebElement year = driver.findElement(By.xpath("//select[@aria-label='Year']"));

Select obj2 = new Select(year);

obj2.selectByVisibleText("2021");





List <WebElement>option = obj.getOptions();
	
	for(WebElement i : option) {
		
		String s = i.getText();
		
System.out.println(s);



WebElement gender = driver.findElement(By.xpath("//label[@class='_58mt']"));

gender.click();




WebElement signup = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));


signup.click();


  
	}
	}

}
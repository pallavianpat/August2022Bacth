package utility;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tempt {

	public static void main(String[] args) throws InterruptedException {
		
		//open flipkart
		
		System.setProperty("webdriver.chrome.driver","D:\\Automation support\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		//cancal
		driver.findElementByXPath("//button[@class='_2KpZ6l _2doB4z']").click();
		
		//mouseOverAction
		
	     Actions act=new Actions(driver);
	   
         WebElement one=driver.findElementByXPath("//*[@class='_1_3w1N']");
	
	      act.moveToElement(one).build().perform();
	        
		//click on profile
		 driver.findElementByXPath("(//*[@class='_3vhnxf'])[1]").click();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
		//user name
		 driver.findElementByXPath("(//*[@type='text'])[2]").sendKeys("9022353012");
		 
	   //password
		driver.findElementByXPath("//*[@type='password']").sendKeys("pallaviashok@123");
		
		//click on login button
		 driver.findElementByXPath("(//*[@type='submit'])[2]").click();
		 Thread.sleep(5000);
		
	    
		driver.findElementByXPath("//*[text()='Manage Addresses']").click();
		
		
		driver.findElementByXPath("//*[text()='ADD ADDRESSES']").click();
		driver.findElementByXPath("//*[@name='name']").sendKeys("pallavi");
		driver.findElementByXPath("//*[@name='phone']").sendKeys("8412885452");
		driver.findElementByXPath("//*[@name='pincode']").sendKeys("412801");
		driver.findElementByXPath("//*[@name='addressLine2']").sendKeys("khandala");
		driver.findElementByXPath("//*[@name='addressLine1']").sendKeys(" shirwal MIDC ,khandala");
	    driver.findElementByXPath("//*[@name='city']").sendKeys("satara");
	    
	   Select state=new Select( driver.findElementByXPath("//*[@name='state']"));
	          state.selectByValue("Maharashtra");
	          
	          
	   driver.findElementByXPath("//*[@name='landmark']").sendKeys("Near Hi-tech company");    
	   driver.findElementByXPath("//*[@name='alternatePhone']").sendKeys("7083061934");
	   
	   driver.findElementByXPath("//*[@class='_1XFPmK']").click();
	   driver.findElementByXPath("(//*[@type='button'])[2]").click();
	   
	   driver.findElementByXPath("//*[text()='Confirm']").click();
	}

}
























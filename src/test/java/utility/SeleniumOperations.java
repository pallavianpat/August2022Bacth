package utility;


import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperations {

	
		public static ChromeDriver driver=null;
		
		public static Hashtable<String,Object> outputparameters=new Hashtable<String,Object>();
		
		//browserLaunch
		 public static  Hashtable<String,Object> browserLaunch(Object[]inputparameters)
		  {
			 try
			 {
		 	 String key=(String) inputparameters[0];
			 String value=(String) inputparameters[1];
			
			
			  System.setProperty(key,value);
			
			  driver=new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			  outputparameters.put("STATUS", "PASS");
			  outputparameters.put("MESSAGE", "methodused: browserLaunch,InputGiven: "+inputparameters[0].toString());
		    }
			 catch(Exception e)
			 {
				 outputparameters.put("STATUS", "FAIL");
				  outputparameters.put("MESSAGE", "methodused: browserLaunch,InputGiven: "+inputparameters[0].toString());
			 }
			 return outputparameters;
		  }
		  
			
			   //open Application
			
		    public static Hashtable<String,Object> openAppliction(Object[]inputparameters)
		    {
		    	try
		    	{
		    	String url=(String)inputparameters[0];
		    	driver.get(url);
		    	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		    	outputparameters.put("STATUS", "PASS");
				outputparameters.put("MESSAGE", "methodused:openAppliction,InputGiven: "+inputparameters[0].toString());
		    	}
		    	catch(Exception e)
		    	{
		    		outputparameters.put("STATUS", "FAIL");
					outputparameters.put("MESSAGE", "methodused:openAppliction,InputGiven: "+inputparameters[0].toString());
		    	}
		    	return outputparameters;
		    }
		    
		    //click on Element
            
		 			public static Hashtable<String,Object> clickonElement(Object [] inputparameters)
		 			{
		 				try
		 				{
		 				String xpath=(String) inputparameters[0];
		 			    driver.findElementByXPath(xpath).click();
		 				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 				outputparameters.put("STATUS", "PASS");
						outputparameters.put("MESSAGE", "methodused:clickonElement,InputGiven: "+inputparameters[0].toString());
				    	
		 				}
		 				catch(Exception e)
		 				{
		 					outputparameters.put("STATUS", "FAIL");
							outputparameters.put("MESSAGE", "methodused:clickonElement,InputGiven: "+inputparameters[0].toString());
					    	
		 				}
		 				return outputparameters;
		 			}
		 			 
		 			 //mouseOverAction
		 			 
		 			 public static Hashtable<String,Object> mouseOver(Object [] inputparameters)
		 			 {
		 				 try
		 				 {
		 				    String xpath=(String) inputparameters[0];
		 				    Actions act=new Actions(driver);
		 				    WebElement one=driver.findElementByXPath(xpath);
		 			        act.moveToElement(one).build().perform();  
		 			        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 			        outputparameters.put("STATUS", "PASS");
						    outputparameters.put("MESSAGE", "methodused: mouseOver,InputGiven: "+inputparameters[0].toString());
				    	
		 				 }
		 				 catch(Exception e)
		 				 {
		 				    outputparameters.put("STATUS", "FAIL");
						    outputparameters.put("MESSAGE", "methodused: mouseOver,InputGiven: "+inputparameters[0].toString());
			 				
		 				 }
		 				return outputparameters;
		 			 }

		 			//sendtextonUI
		 			
		 			 public static  Hashtable<String,Object> sendText(Object[]inputparameters )
		 			 {
		 				 try
		 				 {
		 				 String xpath=(String) inputparameters[0];
		 				 String text=(String) inputparameters[1];
		 				 
		 				 driver.findElement(By.xpath(xpath)).sendKeys(text);
		 				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 				outputparameters.put("STATUS", "PASS");
					    outputparameters.put("MESSAGE", "methodused: sendText,InputGiven: "+inputparameters[1].toString());
			    	
		 				 }
		 				 catch(Exception e)
		 				 {
		 					outputparameters.put("STATUS", "FAIL");
						    outputparameters.put("MESSAGE", "methodused: sendText,InputGiven: "+inputparameters[1].toString());
		 				 }
		 				return outputparameters;
		 			 }
		 			 
		 			 
		 			 
		 			 //Validatelogin
		 			 public static Hashtable<String,Object>validateLogine(Object[]inputparameters )
		 			 {
		 				 try
		 				 {
		 				String requiredurl=(String) inputparameters[0];//my profile
		 				
		 				String catchurl=driver.getTitle();   //my profile
		 				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 				outputparameters.put("STATUS", "PASS");
					    outputparameters.put("MESSAGE", "methodused: validateLogine,InputGiven: "+inputparameters[0].toString());
		 				 
		 				
		 				if(catchurl.equalsIgnoreCase(requiredurl))
		 				{
		 					System.out.println("Test case Pass");
		 				}
		 				else
		 				{
		 					System.out.println("Test case Fail");
		 				}
		 				 }
		 			 
		 				 catch(Exception e)
		 				 {
		 				  outputparameters.put("STATUS", "FAIL");
					      outputparameters.put("MESSAGE", "methodused: validateLogine,InputGiven: "+inputparameters[0].toString());
		 				 }
		 				return outputparameters;
		 			 
		 				 
		 			 }
		 				 			 
		 			 
		 			 

}	 
		 			 
		 			 
		 			 
		 			 
		 			 
		 			 
		 			 
		 	




			
         














package utility;

public class Calling
{
	
	
	
	      public static void main(String[]args)
	      {
		              //browserLaunch
	    	            Object [] input=new Object[2];
		                input[0]="webdriver.chrome.driver";
		                input[1]="D:\\Automation support\\chromedriver.exe";
		                SeleniumOperations.browserLaunch(input);
		
		                //openApplication
		                Object[]input1=new Object[1];
		                input1[0]="https://www.flipkart.com/";
		                SeleniumOperations.openAppliction(input1);
		                
		                //clickonElement
		                Object[]input2=new Object[1];
		                input2[0]="//button[@class='_2KpZ6l _2doB4z']";
		                SeleniumOperations.clickonElement(input2);
		                
		                
		                //mouseOver
		                 Object[]input3=new Object[1];
		                input3[0]="//*[@class='_1_3w1N']";
		                SeleniumOperations.mouseOver(input3);
		                
		                //click on my profil
		                Object[]input4=new Object[1];
		                input4[0]="(//*[@class='_3vhnxf'])[1]";
		                SeleniumOperations.clickonElement(input4);
		                
		                //entertext
		                
		                 
		                Object[]input5=new Object[2];
		                input5[0]="(//*[@type='text'])[2]";
		                input5[1]="uname";
		                SeleniumOperations.clickonElement(input5);
		                
		                
	}                    

}















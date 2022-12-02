package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class Login
{

	     @When("^user provide \"(.*)\" and exe location as \"(.*)\"$")
	   
	      public void  bLaunch(String key,String exe)
	      {
	    	 
	    	 Object [] input=new Object[2];
             input [0] =key;
             input [1] =exe;
             SeleniumOperations.browserLaunch(input);
	      }
	       
	
	
	
	     @When("^user provide url as \"(.*)\"$")
	       public void openAp(String url)
	       {
	    	 Object [] input1=new Object[1];
             input1 [0] =url;
             SeleniumOperations.openAppliction(input1);
	       }
	
	

	     @When("^user cancle initial login page$")
	        public void cancle()
	        {
	    	 Object[]input2=new Object[1];
             input2[0]="//button[@class='_2KpZ6l _2doB4z']";
             SeleniumOperations.clickonElement(input2);
	        }

	
	     @When("^user navigate on login$") 
	          public void navigatelogin()
	          {
	    	     Object[]input3=new Object[1];
                 input3[0]="//*[@class='_1_3w1N']";
                 Hashtable <String,Object> output3=SeleniumOperations.mouseOver(input3);
                 HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(), "^user navigate on login$",output3.get("MESSAGE").toString());
              }
	
	     
	     @When("^user click on My profile$")
	          public void clickprofile()
	         {
	    	 Object[]input4=new Object[1];
             input4[0]="(//*[@class='_3vhnxf'])[1]";
             Hashtable <String,Object> output4=  SeleniumOperations.clickonElement(input4);
             HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "^user click on My profile$",output4.get("MESSAGE").toString());
             }
	
	     
	     
	     @When("^user enter (.+) as user name$")
	     public void user_enter_as_user_name(String uname) throws Throwable
	     {
	    	 Object[]input5=new Object[2];
             input5[0]="(//*[@type='text'])[2]";
             input5[1]=uname;
             Hashtable <String,Object> output5=  SeleniumOperations.sendText(input5);
             HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(), "^user click on My profile$",output5.get("MESSAGE").toString());
	     }

	     @When("^user enter (.+) as password$")
	     public void user_enter_as_password(String pass) throws Throwable
	     {
	    	 Object[]input6=new Object[2];
             input6[0]="//*[@type='password']";
             input6[1]=pass;
             Hashtable <String,Object> output6=  SeleniumOperations.sendText(input6);
             HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(), "^user click on My profile$",output6.get("MESSAGE").toString());
	     }

	     @When("^user click on login button$")
	     public void user_click_on_login_button() throws Throwable 
	     {
	    
	     }

	     @Then("^application shows user profile to user$")
	     public void application_shows_user_profile_to_user() throws Throwable
	     {
	
	     }
	     
	     
	     
	     @Then("^application shows user appropriate error  message$")
	     public void validationInvalid()
	     {
	    	 
	     }
	      


	
	
	
	
	
	
	
	
	
	
	
	
}

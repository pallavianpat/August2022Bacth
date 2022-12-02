Feature: Login functionality

Background: user successfully  clicked on initial login page
When user provide "webdriver.chrome.driver" and exe location as "D:\\Automation support\\chromedriver.exe" 
When user provide url as "https://www.flipkart.com/"
When user cancle initial login page


@SmokeTest
Scenario: Login functionality with valid user name and valid password
When user navigate on login 
When user click on My profile 
When user enter "9022353012" as user name
When user enter "pallaviashok@123" as password
When user click on login button
Then application shows user profile to user



@RegressionTest
Scenario Outline: Login functionality with invalid user name and valid password
When user navigate on login 
When user click on My profile 
When user enter "902235301" as user name
When user enter "pallaviashok@123" as password
When user click on login button
Then application shows user profile to user

package TestCase;



import java.io.IOException;

import org.openqa.selenium.By;

import org.testng.annotations.Test;


import PageObjectModel.LoginPageObjects1;
import Resources.BaseClass;
import Resources.CommonUtilities;
import Resources.TestCaseData;

public class VerifyLoginTestCase extends BaseClass {
	// we have achieve Inheritance here.
	
	@Test   //1st - add Tesng library. 2nd- import org.testng.annotations.
	public void login() throws IOException {
		
		//browserlaunch();   // add throws.-> browserlaunch method ला Call केली.
		//This driver have Scope.
		//driver.get("https://login.salesforce.com/?locale=in"); //before test method-करण्यापुर्णी ते 2 Line चा code 1st - browserlaunch (); 2nd- driver.get("url"); चा
		
	  LoginPageObjects1 lpo=new LoginPageObjects1(driver);   // objet create then all method are call
		lpo.EnterUsername().sendKeys(TestCaseData.username);  // testcasedata हा class आहे .आहे म्हणून class add केला 
		lpo.EnterPassword().sendKeys(TestCaseData.password);
		lpo.ClickLogin().click();

		String expected="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";		 

		String actual=driver.findElement(By.xpath("//div[@id='error']")).getText();
		
		 // Soft assert.
					
		CommonUtilities.assertionhandle(actual,expected);
			  
	}

}

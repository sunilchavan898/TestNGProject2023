package TestCase;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects1;
import PageObjectModel.SignUpPageObjects;
import Resources.BaseClass;
import Resources.CommonUtilities;
import Resources.TestCaseData;

public class VerifySignUpTestCase extends BaseClass {
	
	@Test
	public void SignUp() throws IOException, InterruptedException {
		
		browserlaunch();
		driver.get("https://login.salesforce.com/?locale=in");
		
		LoginPageObjects1 lpo=new LoginPageObjects1(driver); 
		lpo.ClickonTryforFree().click();
		
		Thread.sleep(5000);
		// expected and actual result.
	
		 String expectedtitle=TestCaseData.expectedtitle;
		
		String actualtitle=driver.getTitle();
		
		CommonUtilities.assertionhandle(actualtitle, expectedtitle);
		
		// Signup page separete आहे म्हणून separate obj create केला. 
		SignUpPageObjects spo=new SignUpPageObjects(driver);
		spo.firstnamebutton().sendKeys(TestCaseData.firstname);
		
		spo.lastnamebutton().sendKeys(TestCaseData.lastname);
		
		spo.workemailbutton().sendKeys(TestCaseData.workemailbutton);
		
		spo.companybutton().sendKeys(TestCaseData.companybutton);
		
		spo.phonebutton().sendKeys(TestCaseData.phonebutton);
		
	
		
		//getttile
	   /*	Select s=new Select(spo.gettitlebutton()); // static dropdwon.
		s.selectByIndex(1); // by index method.*/
		CommonUtilities.dropdownhandle(spo.gettitlebutton(),1); //-> common utilities one line मध्ये code झाला 
					
		//employees
		/*Select s1=new Select(spo.employeesbutton());
	    spo.employeesbutton().click();
	    s1.selectByIndex(4); */
		CommonUtilities.dropdownhandle(spo.employeesbutton(),2 );		
	
		// Country/region.
		/*Select s3=new Select(spo.countryregionbutton());
		spo.countryregionbutton().click();
		s3.selectByVisibleText("Iceland"); */
	
	    CommonUtilities.dropdownhandle(spo.countryregionbutton(),2);
		
	
	
		
		
	}

}

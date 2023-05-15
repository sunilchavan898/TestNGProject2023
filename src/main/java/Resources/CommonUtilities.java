package Resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class CommonUtilities {
	
	
	
	// this s common method for dropdown handling. 
	public static  void dropdownhandle(WebElement dropdownxpath,int dropdownvalue ) {
		
		Select s=new Select(dropdownxpath);
		s.selectByIndex(dropdownvalue);
				
	}
    public static  void assertionhandle(String actual,String expected) {
    	
    	SoftAssert assertion=new SoftAssert();
		Assert.assertEquals(actual,expected);
		assertion.assertAll();  //  This line Mandatory आहे कारण पुढची line print करण्यासाठी.		
	
    	
    	
    }
}
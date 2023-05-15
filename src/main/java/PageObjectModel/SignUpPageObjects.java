package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObjects {
	// This driver Dont have Scope.
		public WebDriver driver;
	
	
	// driver.findeElement(By.Xpath(" ")) - फक्त येव्हडच return करून देती
	// we have achieve Encapsulation here.
	// All Locators(Xpath) are store in Page Objects Model file.
	
	private By firstname=By.xpath("//input[@name='UserFirstName']");   // this is full line store in username.
	private By lastname=By.xpath("//input[@name='UserLastName']");   // Declare private - encapsulation sensitive data hidden from users.
	private By workemail=By.xpath("//input[@name='UserEmail']");
	private By jobtitle=By.xpath("//select[@name='UserTitle']");
	private By company=By.xpath("//input[@name='CompanyName']");
	private By employees=By.xpath("//select[@name='CompanyEmployees']");
	private By phone=By.xpath("//input[@name='UserPhone']");
	private By countryregion=By.xpath("//select[@name='CompanyCountry']");



	
	

	

	   //method
		    
	
	
		

		public SignUpPageObjects(WebDriver driver2) {
		// TODO Auto-generated constructor stub
			this.driver=driver2;
	}
		public WebElement firstnamebutton() {	   
	    	 return driver.findElement(firstname);// line no.11 - By username=By.xpath("//input[@id='username']"); असं दिसेल 	     	   
	       }
		public WebElement lastnamebutton() {	   
	    	 return driver.findElement(lastname);// line no.11 - By username=By.xpath("//input[@id='username']"); असं दिसेल 	     	   
	       }
		public WebElement workemailbutton() {	   
	    	 return driver.findElement(workemail);// line no.11 - By username=By.xpath("//input[@id='username']"); असं दिसेल 	     	   
	       }
		public WebElement gettitlebutton() {	   
	    	 return driver.findElement(jobtitle);// line no.11 - By username=By.xpath("//input[@id='username']"); असं दिसेल 	     	   
	       }
		public WebElement companybutton() {	   
	    	 return driver.findElement(company);// line no.11 - By username=By.xpath("//input[@id='username']"); असं दिसेल 	     	   
	       }
		public WebElement employeesbutton() {	   
	    	 return driver.findElement(employees);// line no.11 - By username=By.xpath("//input[@id='username']"); असं दिसेल 	     	   
	       }
		public WebElement phonebutton() {	   
	    	 return driver.findElement(phone);// line no.11 - By username=By.xpath("//input[@id='username']"); असं दिसेल 	     	   
	       }
		public WebElement countryregionbutton() {	   
	   	 return driver.findElement(countryregion);// line no.11 - By username=By.xpath("//input[@id='username']"); असं दिसेल 	     	   
	       }
	
		
}


package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects1 {
	// This driver Dont have Scope.
	public WebDriver driver;
	
	// driver.findeElement(By.Xpath(" ")) - फक्त येव्हडच return करून देती
	// we have achieve Encapsulation here.
	// All Locators(Xpath) are store in Page Objects Model file.
	
	private By username=By.xpath("//input[@id='username']");   // this is full line store in username.
	private By password=By.xpath("//input[@id='password']");   // Declare private - encapsulation sensitive data hidden from users.
	private By LoginButtom=By.xpath("//input[@id='Login']");
	private By TryforFree=By.xpath("//a[@id='signup_link']");
	
   //method
	    
	public LoginPageObjects1(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}

	
	public WebElement EnterUsername() {	   
    	 return driver.findElement(username);// line no.11 - By username=By.xpath("//input[@id='username']"); असं दिसेल 	     	   
       }
       
       public WebElement EnterPassword() {  	   
       	 return driver.findElement(password);	   
       }
       
       public WebElement ClickLogin() {  	   
         return driver.findElement(LoginButtom);  	   
          }
       public WebElement ClickonTryforFree() {  	   
           return driver.findElement(TryforFree);  	   
            }
}

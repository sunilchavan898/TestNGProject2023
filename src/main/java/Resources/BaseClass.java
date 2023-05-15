package Resources;


import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	public WebDriver driver; // globallty declare
	public Properties prop;  // Properties global declare केलं कारण एक common URl पाहिजे होता.
	
	public WebDriver browserlaunch() throws IOException  {

		/*to read the file
		 *this will help us to Read data.properties.
		 *data.properties चा path पाहिजे.("-")inside  */
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
		
		//properties  हा  java चा class आहे.-> Import java.util-> properties class ahe
		//This will Access data.properties file
		  prop=new Properties();
		 
		 //(import stream)-> add throws -> FIS ला read करण्यासाठी
		 prop.load(fis);
		 
		 // (String Key)-> parameter key pass करणे-> return -key ला value देणार.
		String browserName= prop.getProperty("browser");
		
		// equalignorecase means-Small/Capital alphabet not matter.
		if(browserName.equalsIgnoreCase("chrome")) {
			
		WebDriverManager.chromedriver().setup();  // this line code any chrome browser lates version in your system.
 	 // WebDriverManager.chromedriver().versions("103.1.0").setup(); -> this line code specific browser verion.
		  driver=new ChromeDriver();		 
		}
		else if(browserName.equalsIgnoreCase("chrome")) {
			
			// Two Line Code Firefox. 
		}
        else if(browserName.equalsIgnoreCase("edge")) {
			
			// Two Line Code edge. 
		}
        else {
        	System.out.println("please select valid browser");
        }
		return driver;
	}
	
	@BeforeMethod
	public void launchbrowser() throws IOException {
		browserlaunch();
		driver.get(prop.getProperty("url")); // हा URL data .properties मधून access करेल. 
			
	}
	@AfterMethod
	public void quitebrowser() throws IOException {
	   driver.quit();
	}
}

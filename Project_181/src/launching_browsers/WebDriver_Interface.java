package launching_browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Interface {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * WebDriver is a common interface class, It can manipulate
		 * any browser instance support by selenium.
		 */
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();      //Launch browser
		driver.get("https://facebook.com");       //load page to browser
		driver.manage().window().maximize();	  //Maximize browser window
		
		
		
		Thread.sleep(5000);
		driver.close();  
		
		

		/*
		 * WebDriver Exceptions:-->
		 * 	
		 * 			1. WebDriver driver=new ChromeDriver();
		 * 
		 * 					IllegalStateException:-->
		 * 							This exception throw by webdriver when
		 * 							browser driver path not located before
		 * 							launch browser..
		 * 
		 * 			2. driver.get("http://facebook.com");
		 * 			
		 * 					SessionNotCreatedException:-->
		 * 							This exception throw by webdriver when
		 * 							browser version and browser driver version
		 * 							mismatch.
		 * 
		 * 			3. driver.get("www.facebook.com");
		 * 						InvalidSelectorException:-->
		 * 							This Exception throw by webdriver when
		 * 							url define with wrong protocal. WebDriver
		 * 							launch application with valid protocals
		 * 							are http://   or https://
		 * 							[driver.get("https://facebook.com")]
		 * 			
		 */
		
		
		
	}

}

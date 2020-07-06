package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Selection_methods {

	public static void main(String[] args) throws Exception 
	{

		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();      						//Launch browser
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");       //load page to browser
		driver.manage().window().maximize();	  						//Maximize browser window
		
		
		
		
		/*
		 * Note:--> For select tag elements we need to follow below syntax
		 * 			
		 * 		new Select(WebElement).SelectByVisibleText("OptionName");
		 */
		
		 new Select(driver.findElement(By.id("customState"))).selectByVisibleText("Telangana");
		 Thread.sleep(3000);
		 
	 
		/*
		 * Note:--> For select tag elements we need to follow below syntax
		 * 			
		 * 		new Select(WebElement).SelctByvalue("Option tag value Property");
		 */
		 new Select(driver.findElement(By.id("customCity"))).selectByValue("hyderabad");
		 
		 
		//Type locality at editbox
		 driver.findElement(By.id("customLocality")).sendKeys("Gandhi nagar");
		 
		 

		/*
		 * Note:--> For select tag elements we need to follow below syntax
		 * 			
		 * 		new Select(WebElement).SelctByvalue("Option tag value Property");
		 */
		 new Select(driver.findElement(By.id("customRadius"))).selectByIndex(4);
		
		
		
	}

}

package ui_validation_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Runtime_Elements_Is_Displayed {

	public static void main(String[] args) throws Exception 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();  		//Launch browser
		driver.get("http://www.cleartrip.com");  	//Load webpage
		driver.manage().window().maximize(); 		 //maximize browser window
		Thread.sleep(5000);
	
		//target more options link
		WebElement More_options=driver.findElement(By.xpath("//a[@id='MoreOptionsLink']"));

		/*
		 * Testcase:-->
		 * Click More options. Expected "Class of travel" and "Preffered
		 * airlines" element should visible at webpage..
		 */
		More_options.click();
		Thread.sleep(5000);
		
		
		//Verify ClassofTravel and Airlines visible at webpage
		WebElement Travel_Class=driver.findElement(By.xpath(".//*[@id='Class']"));
		WebElement Airlines=driver.findElement(By.xpath("//input[@name='airline']"));
		
		if(Travel_Class.isDisplayed() && Airlines.isDisplayed())
			System.out.println("Testpass, Both Elements visible at webpage");
		else
			System.out.println("Testfail, Both Elements not visible at webpage");
		
		/*
		 * Testcase:-->
		 *  => Click More options.when travel class and airlines elements are visible
		 *  => Expected "Class of travel" and "Preffered
		 * 		airlines" elements hide from webpage
		 */
		Thread.sleep(5000);
		
		if(Travel_Class.isDisplayed() && Airlines.isDisplayed())
		{
				//Click Moreoptions link
				More_options.click();
				Thread.sleep(3000);
				
				if(!Travel_Class.isDisplayed() && !Airlines.isDisplayed()) //!--NOT
					System.out.println("Testpass:--> As expected it is hidden at webpage");
				else
					System.out.println("Testfail:--> Element still visible at webpage");
		}
		else
			System.out.println("Precondition failed");
		
		
	}

}

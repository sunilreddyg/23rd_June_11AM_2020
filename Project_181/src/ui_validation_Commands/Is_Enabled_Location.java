package ui_validation_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Is_Enabled_Location {

	public static void main(String[] args) throws Exception 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();  						//Launch browser
		driver.get("https://v1.hdfcbank.com/branch-atm-locator/?"); //Load webpage
		driver.manage().window().maximize();  						//maximize browser window
		Thread.sleep(5000);		

		/*
		 * Testcase:--> Verify locality editbox before state and city selection
		 * expected:--> Editbox should disable and not allowed user to type characters.
		 */
		
		WebElement Locality_Editbox=driver.findElement(By.id("customLocality"));
		
		if(!Locality_Editbox.isEnabled())  //!--NOT
		{
			System.out.println("Testpass :--> As expected locality editbox was disable");
		}
		else
		{
			System.out.println("TestFail :--> Expecation faile locality editbox is enabled");
		}
		
		
		/*
		 * Testcase:-->Verify locality editbox After state and city selection
		 * expected:--> Editbox should enabled and allow user to type characters
		 */
		
		//Select State Dropdown
		WebElement State_Dropdown=driver.findElement(By.id("customState"));
		new Select(State_Dropdown).selectByVisibleText("Telangana");
		
		//Timeout to load city options
		Thread.sleep(5000);
		
		//Select City Dropdown
		WebElement City_dropdown=driver.findElement(By.id("customCity"));
		new Select(City_dropdown).selectByVisibleText("Hyderabad");
		
		//Timeout before validate
		Thread.sleep(5000);
		
		
		if(Locality_Editbox.isEnabled())
			System.out.println("Testpass editbox enabled after state selection");
		else
			System.out.println("Testfail editbox disabled after state selection");
		
		
		
		

	}

}

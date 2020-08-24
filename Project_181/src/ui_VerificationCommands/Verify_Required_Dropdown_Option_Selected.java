package ui_VerificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Required_Dropdown_Option_Selected {

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://cleartrip.com");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    
	    
	    //Select Number of adults
	    new Select(driver.findElement(By.id("Adults"))).selectByVisibleText("5");
	    
	    //Verify Dropdown option selected 5
	    String value=driver.findElement(By.id("Adults")).getAttribute("value");
	    System.out.println("Dropdown selected value is -> "+value);
		

	}

}

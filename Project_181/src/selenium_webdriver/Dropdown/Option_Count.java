package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Option_Count {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();      						//Launch browser
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");       //load page to browser
		driver.manage().window().maximize();							//Maximize browser window
		
		
		
		int OptionCount=new Select(driver.findElement(By.id("customState"))).getOptions().size();
		System.out.println("Dropdown Option Count is => "+OptionCount);
		
		
		/*
		 * getOptions:--> It return number of option tags under select tag.
		 */
		
		
		
		
		

	}

}

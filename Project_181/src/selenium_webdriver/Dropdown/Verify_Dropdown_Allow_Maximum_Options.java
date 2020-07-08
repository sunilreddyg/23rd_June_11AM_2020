package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_Allow_Maximum_Options 
{
	public static void main(String[] args) throws Exception 
	{
		
		
		/*
		 * Example:--> Verify dropdown allow morethan one selection at Dropdown.
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();      						//Launch browser
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");       //load page to browser
		driver.manage().window().maximize();							//Maximize browser window
		
		
		/*
		 * Using javascript converting Single option dropdown to multiple option dropdown.
		 */
		((JavascriptExecutor)driver).executeScript
		("document.getElementById('customState').setAttribute('multiple','multiple')");
		Thread.sleep(5000);
		
		
		boolean flag=new Select(driver.findElement(By.id("customState"))).isMultiple();
		System.out.println("Dropdown Multiple Seletion Status is => "+flag);
		
		
		//Two decision statement
		if(flag==true)
		{
			System.out.println("it's True, Dropdown is multiple selection type");
			
			Select State_Dropdown=new Select(driver.findElement(By.id("customState")));
			State_Dropdown.deselectAll();  //Deselect only possible on multiple selection dropdown
			State_Dropdown.selectByIndex(2);
			State_Dropdown.selectByIndex(4);
			State_Dropdown.selectByIndex(6);
			
			//Nested if condition to verify dropdown Selection Count
			int Selection_Count=State_Dropdown.getAllSelectedOptions().size();
			if(Selection_Count > 1)
			{
				System.out.println("Dropdown allowed user to select multiple option");
			}
			else
			{
				System.out.println("Dropdown failed to select multiple option");
			}
			
		}
		else
		{
			System.out.println("Dropdown is not a multiple selection type");
		}
		
		
		
		
		
		

	}

}

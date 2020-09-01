package ui_validation_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Displayed_method_For_Static_Elements {

	public static void main(String[] args)
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  	//Launch browser
		driver.get("https://www.outlook.com");  //Load webpage
		driver.manage().window().maximize();    //maximize browser window
		
		
		//IDentify Signin button location
		WebElement Signin_btn=driver.findElement(By.id("(//a[contains(.,'Sign in')])[1]"));
		if(Signin_btn.isDisplayed())
		{
			Signin_btn.click();
		}
		else
		{
			System.out.println("Element is not visible at webpage");
		}
		
		
		/*
		 * Note:--> For static elements no need to write IsDisplayed Method.Any way
		 * 			Webdriver throw "ElementNotVisible" exception incase we try to
		 * 			perform action on hidden element.
		 */
		
		
		WebElement Email=driver.findElement(By.xpath("//input[contains(@id,'i0116')]"));
		if(Email.isDisplayed() && Email.isEnabled())
		{
			//This lines of code execute only when element is visible at webpage & Ready state is ON.
			Email.clear();
			Email.sendKeys("sunilreddy.gajjala@gmail.com");
		}
		else
		{
			System.out.println("Email element is not displayed or Enabled");
		}
		
		
		
		
		//Exception handling
		try {
			WebElement Email_next_btn=driver.findElement(By.xpath("//input[@id='idSIButton9']"));
			Email_next_btn.click();
			
		} catch (ElementNotVisibleException e) {
			System.out.println(e.getMessage());
		} catch (InvalidElementStateException e) {
			System.out.println(e.getMessage());
		} finally {driver.close();}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

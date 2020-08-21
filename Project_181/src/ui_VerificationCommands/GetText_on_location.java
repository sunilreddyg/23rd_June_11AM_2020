package ui_VerificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText_on_location 
{

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Feature:
		 * 			Verifying flight search 
		 * 
		 * 		Scenario:
		 * 				Searching flight without enter proper data
		 * 				
		 * 				Given site url "http://cleartrip.com"
		 * 				When user leave mandatory fields From and To Editboxes
		 * 				And click on flight search button
		 * 				Then receive Error message "Sorry, but we can't"
		 */
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://cleartrip.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		//After leaving mandatory fields click on search flight button
		WebElement Search_flight=driver.findElement(By.xpath("//input[contains(@id,'SearchBtn')]"));
		Search_flight.click();
		Thread.sleep(5000);
		
		//Identify Error location
		WebElement Error_location=driver.findElement(By.xpath("//div[@id='homeErrorMessage']"));
		//Capture error location innerText at runtime
		String Runtime_Error_msg=Error_location.getText();
		System.out.println(Runtime_Error_msg);
		
		String Exp_text="Sorry, but we can't continue until you fix everything that's marked in RED";
		
		
		if(!Runtime_Error_msg.isEmpty()) //!--Not  //GetText return empty when text is not visible webpage
		{
			System.out.println("Error Text visible at webpage");
			
			//Condition to verify expected and Acutal text
			if(Runtime_Error_msg.equals(Exp_text))
				System.out.println("Testpass, As expected Required error message was displayed");
			else
				System.out.println("TestFail, Wrong Error message Displayed");
			
			Thread.sleep(3000);
			driver.close();
		}
		else
		{
			System.out.println("Error text not visible at webpage");
		}
		
		
		
		

	}

}

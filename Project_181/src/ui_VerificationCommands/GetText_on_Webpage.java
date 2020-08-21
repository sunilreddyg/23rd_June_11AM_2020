package ui_VerificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText_on_Webpage {

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
		
		
		//Identify total webpage and capture visible text init
		WebElement Page=driver.findElement(By.tagName("body"));
		//Capture page visible text
		String Page_Visble_Text=Page.getText();
		//System.out.println(Page_Visble_Text);
		
		
		
		String Exp_text="Sorry, but we can't continue until you fix everything that's marked in RED";
		
		//Decision to verify expected text presented at location
		if(Page_Visble_Text.contains(Exp_text))
		{
			System.out.println("Testpass, Expected text visible at webpage");
		}
		else
		{
			System.out.println("Testfail, Expected text not visible at webpage");
		}
		
	}

}

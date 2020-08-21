package ui_VerificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdwon_Option_Availability {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Feature:
		 * 			Verifying Correspondent City Displayed on State Selection
		 * 
		 * 		Scenario:
		 * 				City Selection w.r.t State Selection
		 * 				
		 * 				Given site url "https://v1.hdfcbank.com/branch-atm-locator"
		 * 				When user Select Any option at StateDropdown
		 * 				And wait for 5 seconds
		 * 				Then receive List of Cities under State.
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		//Select Andra Pradesh option at State Dropdown
		new Select(driver.findElement(By.xpath("//select[@id='customState']")))
		.selectByVisibleText("Andhra Pradesh");
		Thread.sleep(5000);  //Satic timeout to load cities
		
		
		//Identify City Element
		WebElement City_Dropdown=driver.findElement(By.xpath("//select[@id='customCity']"));
		//Get option names under city dropdown
		String All_Cities=City_Dropdown.getText();
		System.out.println(All_Cities);
		
		
		//Decison to verify expected city displayed under cities dropdown
		if(All_Cities.contains("Anantapur"))
			System.out.println("Testpass, As expected required city displayed on State Selection");
		else
			System.out.println("Testfail, Expected city not displayed");
		
		
		
		//Close browser
		Thread.sleep(3000);
		driver.close();
	}

}

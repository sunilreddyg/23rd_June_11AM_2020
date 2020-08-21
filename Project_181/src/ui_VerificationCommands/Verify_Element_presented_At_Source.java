package ui_VerificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Element_presented_At_Source {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		
		//Get Current window pageSource
		String Page_Source=driver.getPageSource();
		
		//Condition to verify required element source presented at pagesource
		if(Page_Source.contains("email"))
		{
			//THis block of code only execute when required elemnet presented at source
			System.out.println("Required element presented at source");
			WebElement Email=driver.findElement(By.id("email"));
			Email.clear();
			Email.sendKeys("qadarshan@gmail.com");
		}
		else
		{
			System.out.println("Required element not presented at source");
		}
		
		
		
		
		
		
		/*
		 * We can also use try-catch for Runtime Elements identification.
		 */
		try {
			
			WebElement Password=driver.findElement(By.id("pass"));    //FindElement method throw exception incase element not found at source
			Password.clear();
			Password.sendKeys("qadarshan@gmail.com");
		
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("password elemnet not presented at source");
		}
		
		
		System.out.println("Run Completed");
		
		
		
		
		
		
		
		
		

	}

}

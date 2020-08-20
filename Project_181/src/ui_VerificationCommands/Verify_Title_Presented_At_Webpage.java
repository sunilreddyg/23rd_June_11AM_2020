package ui_VerificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Title_Presented_At_Webpage {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.dev");
		driver.manage().window().maximize();
		
		
		//Get Current window title
		String Act_title=driver.getTitle();
		System.out.println("Current window title is -> "+Act_title);
		
		
		String Exp_title="SeleniumHQ Browser Automation";
		
		//Verify Equal comparision between two strings
		boolean flag=Act_title.equals(Exp_title);
		System.out.println("Equal comparision is -> "+flag);
		
		
		//Write conditional statement to continue program execution on expected title presented
		if(flag==true)
		{
			WebElement Downloads_link=driver.findElement(By.xpath("//a[@class='nav-item'][contains(.,'Downloads')]"));
			Downloads_link.click();
			
			
			//Nested condition to check download page title
			if(driver.getTitle().equals("Downloads"))
				System.out.println("Expected title presented download page");
			else
				System.out.println("Wrong title presented for downloads page");
			
			
			
		}
		else
		{
			System.out.println("Expected title not presented for selenium homepage");
		}
		
		
		
		Thread.sleep(3000);
		driver.close();

	}

}

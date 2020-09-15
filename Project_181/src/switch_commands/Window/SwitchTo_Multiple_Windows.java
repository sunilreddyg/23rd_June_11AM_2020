package switch_commands.Window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Multiple_Windows {

	public static void main(String[] args) throws Exception 
	{
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "D:\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();					
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize(); 
		
		
		//Click Hyperlink to open at new window
		driver.findElement(By.xpath("//a[@href='http://www.cleartrip.com/trains/pnr']")).click();
		Thread.sleep(2000);
		
		//Click Hyperlink to open at new window
		driver.findElement(By.xpath("//a[@href='http://www.cleartrip.com/trains/calendar']")).click();
		Thread.sleep(2000);
		
		//Click Hyperlink to open at new window
		driver.findElement(By.xpath("//a[contains(@href,'cancellation.shtml#cancel')]")).click();
		Thread.sleep(2000);
		
		//Click Hyperlink to open at new window
		driver.findElement(By.xpath("//a[@href='http://www.cleartrip.com/offers/india/irctc-packages']")).click();
		Thread.sleep(2000);
		
		
		//Get all Dynamic Window ID's
		Set<String> All_WindowIDs=driver.getWindowHandles();
		//Apply foreach to iterate number of windows
		for (String EachwindowID : All_WindowIDs) 
		{
			//it switch to Each window
			driver.switchTo().window(EachwindowID);
			
			//Get Current window title
			String runtime_title=driver.getTitle();
			System.out.println(runtime_title);
			
			if(runtime_title.contains("Cancel Train Bookings"))
			{
				break; //This command break iteration and keep Controls at Same window
			}
			
			
		}
		

		System.out.println("Current Focused window title is ---> "+driver.getTitle());

	}

}

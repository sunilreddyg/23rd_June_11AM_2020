package switch_commands.Window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Reusable_SwitchTo_Window_Method 
{
	static WebDriver driver;
	
	/*
	 * Reusable method:--> This method helps to switch to window with help of title
	 */
	public static void SwitchTo_Window_With_Title(String Exp_title)
	{
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
			
			if(runtime_title.contains(Exp_title))
			{
				break; //This command break iteration and keep Controls at Same window
			}
			
		}
	}
	
	

	public static void main(String[] args) throws Exception 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "D:\\Browser_Drivers\\chromedriver.exe");
		driver=new ChromeDriver();					
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
		
		
		SwitchTo_Window_With_Title("Cancel Train Bookings");
		System.out.println("Current Focused window title is ---> "+driver.getTitle());
		Thread.sleep(2000);
		
		
		SwitchTo_Window_With_Title("IRCTC Railway PNR Status");
		System.out.println("Current Focused widnow title is ---> "+driver.getTitle());
				

	}

}

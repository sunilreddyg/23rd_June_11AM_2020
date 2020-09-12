package switch_commands.Window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Next_Window {

	public static void main(String[] args) throws Exception
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "D:\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();					
		driver.get("https://facebook.com");
		driver.manage().window().maximize(); 
		
		
		String MainWindow_ID=driver.getWindowHandle();
		System.out.println("Runtime ID is --> "+MainWindow_ID);
		
		
		//Click Instagram hyper link [This link open page in new window]
		driver.findElement(By.linkText("Instagram")).click();
		Thread.sleep(4000);
		
		
		//Get All window ID's open throw webdriver browser.
		Set<String> All_WindowIDS=driver.getWindowHandles();
		
		//Apply for each loop
		for (String EachWindowID : All_WindowIDS) 
		{
			if(!EachWindowID.equals(MainWindow_ID)) //!--NOT
			{
				driver.switchTo().window(EachWindowID);
				break; 
			}
		}
		
		
		System.out.println("Current Focused window title is --> "+driver.getTitle());
		
		

	}

}

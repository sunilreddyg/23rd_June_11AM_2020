package ui_VerificationCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Page_Verifications {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.dev");
		driver.manage().window().maximize();
		
		
		
		//Get Current window title
		String page_title=driver.getTitle();
		System.out.println("Current window title is -> "+page_title);
		
		
		//Get Current window url
		String Page_url=driver.getCurrentUrl();
		System.out.println("Current window url is --> "+Page_url);
		
		//Get Current window Dynamic ID      [This id only genarate during browser running time]
		String Dynamic_ID=driver.getWindowHandle();
		System.out.println("Current window Dynamic ID is --> "+Dynamic_ID);
		
		//Get Current page Source
		String Page_Source=driver.getPageSource();
		System.out.println(Page_Source);
		
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		
		
		
		

	}

}

package browser_navigation_commannds;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Navigation_Commands 
{

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		//Using navigation command load new page at browser window
		driver.navigate().to("https://www.messenger.com/");
		
		//Get back controls to previous page
		driver.navigate().back();
		Thread.sleep(2000);
		
		//Get controls to forward page
		driver.navigate().forward();
		Thread.sleep(2000);
		
		
		//Reload webpage
		driver.navigate().refresh();
		
		
		//Close browser window
		driver.close();       //[Only single window to close]
		
		
		//Quit all automation browser windows.
		driver.quit();       //[It close multiple windows opened throw webdriver]
		
		

	}

}

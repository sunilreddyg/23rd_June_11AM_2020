package selenium_webdriver.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboard_ShortCut_With_Sendkeys {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();      		//Launch browser
		driver.get("https://facebook.com");       		//load page to browser
		driver.manage().window().maximize();	  		//Maximize browser window
		
		
		
		driver.findElement(By.name("firstname"))
		.sendKeys("Aakash"+Keys.TAB+
				"varama"+Keys.TAB+
				"Aakashvarma@gmail.com"+Keys.TAB+
				"Aakashvarma@gmail.com"+Keys.TAB+
				"Hello12345");
		
		
		Thread.sleep(5000);  //Just for observation.
		
		
		/*
		 * Note:--> For dropdown selection webdriver hava separate methods,Below
		 * 			you can see selecting dropdown with keyboard features.. 
		 */
		
		
		//Seleting dropdown option using keyboard characters
		driver.findElement(By.id("day")).sendKeys("24");
		Thread.sleep(2000);  //Just for observation.
		
		//Seleting dropdown option using keyboard shrotcuts
		driver.findElement(By.name("birthday_month")).sendKeys("D"+Keys.ARROW_UP+Keys.ARROW_UP);
		Thread.sleep(2000);  //Just for observation.
		
		//Selecting dropdown option using keyboard shortcuts
		driver.findElement(By.id("year")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		Thread.sleep(2000);  //Just for observation.
		
		
		//Selecting radio button using keyboard shortcut
		driver.findElement(By.xpath("//input[@value='1']")).sendKeys(Keys.SPACE);
		
		
		/*
		 * Note:--> For Sendkeys command webdriver doesn't throw any Exception, Incase
		 * 			given keyboard shortcut failed we don't receive any failure notice..
		 */

	}

}

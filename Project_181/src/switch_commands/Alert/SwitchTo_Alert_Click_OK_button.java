package switch_commands.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchTo_Alert_Click_OK_button {

	public static void main(String[] args) throws Exception 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();  						//Launch browser
		driver.get("http://demo.automationtesting.in/Alerts.html"); //Load webpage
		driver.manage().window().maximize();  						//maximize browser window
		
		
		WebElement Alert_link=driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		Alert_link.click();  //This Line of code prompt alert at webpage.
		Thread.sleep(5000);
		
		Alert alert=driver.switchTo().alert();

		//Capture text on alert
		String alert_text=alert.getText();
		System.out.println("Text displayed on alert is ---> "+alert_text);
		
		//Close alert
		alert.accept();
		
		/*
		 * Note:--> Here dismiss command also can close alert.
		 */
	}

}

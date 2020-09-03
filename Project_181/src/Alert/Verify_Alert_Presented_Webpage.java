package switch_commands.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Verify_Alert_Presented_Webpage {

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
		
		
		try {
			
			driver.switchTo().alert().accept();
			System.out.println("Alert presented at webpage");
			
		} catch (NoAlertPresentException e) {
			System.out.println("Alert not presented at webpage");
		}
		
		
		System.out.println("Run Continued");
		
		

	}

}

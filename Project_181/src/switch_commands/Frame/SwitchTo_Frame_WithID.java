package switch_commands.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchTo_Frame_WithID {

	public static void main(String[] args) 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();  						
		driver.get("https://www.cleartrip.com/account/trips?src=manageTripsl");
		driver.manage().window().maximize();  	
		
		
		//Apply switch to frame using frame ID
		driver.switchTo().frame("modal_window");
		
		
		//Identifying under frame element
		WebElement Email_EB=driver.findElement(By.id("email"));
		Email_EB.clear();
		Email_EB.sendKeys("qadarshan@gmail.com");
		
		//Identifying under frame element
		WebElement TripID=driver.findElement(By.xpath("//input[@id='tripidSecond']"));
		TripID.clear();
		TripID.sendKeys("86897987987");
		
		
		//Get Controls back to Webapge
		driver.switchTo().defaultContent();
		
		
		//Identify element under mainpage
		WebElement Flights=driver.findElement(By.xpath("//span[contains(.,'Flights')]"));
		Flights.click();
		
		
	}

}

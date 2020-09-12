package switch_commands.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Without_SwitchTo_NavigateTo_Frame {

	public static void main(String[] args) {
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();  						
		driver.get("https://www.cleartrip.com/account/trips?src=manageTrips");
		driver.manage().window().maximize();  	
		
		
		//Navigate to frame address
		driver.navigate().to("https://www.cleartrip.com/signinstatic/tripidlogin.shtml?popup=no&guest=true");		

		
		//Identifying under frame element
		WebElement Email_EB=driver.findElement(By.id("email"));
		Email_EB.clear();
		Email_EB.sendKeys("qadarshan@gmail.com");
		
		//Identifying under frame element
		WebElement TripID=driver.findElement(By.xpath("//input[@id='tripidSecond']"));
		TripID.clear();
		TripID.sendKeys("86897987987");
		
	
		
		
	}

}

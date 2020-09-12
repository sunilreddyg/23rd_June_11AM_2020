package switch_commands.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Switch_BetWeen_Frames 
{

	public static void main(String[] args) throws Exception 
	{
		
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();  						
		driver.get("https://epass.apcfss.in/");
		driver.manage().window().maximize(); 
		
		
		//Switch to frame using ID
		driver.switchTo().frame("menuFrame");
		
		//click link under menuframe
		WebElement FeeStructure_link=driver.findElement(By.xpath("//a[@href='FeestructureReport.do']"));
		FeeStructure_link.click();
		Thread.sleep(5000);
		
		
		//Get Controls back to mainpage from MenuFrame
		driver.switchTo().defaultContent();
		
		
		//Switch to another frame
		driver.switchTo().frame("bodyFrame");
		
		
		//Select Dropdown under bodyframe
		Select University=new Select(driver.findElement(By.xpath("//select[@id='univ']")));
		University.selectByIndex(3);
		
		
		
	}

}

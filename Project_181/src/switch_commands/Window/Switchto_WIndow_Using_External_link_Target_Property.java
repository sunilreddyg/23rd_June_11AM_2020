package switch_commands.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Switchto_WIndow_Using_External_link_Target_Property {

	public static void main(String[] args) throws Exception 
	{

		//Set runtime environment variable for chromedriver
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://epass.apcfss.in/");
		driver.manage().window().maximize();
		
		
		//Get Current window Dynamic ID
		String MainwindowID=driver.getWindowHandle();
		
		
		//Switch to frame using frame ID
		driver.switchTo().frame("message");
		
		//Under message frame click college report link
		WebElement College_Reports=driver.findElement(By.xpath("//a[@href='CollegeReports.html']"));
		College_Reports.click();
		Thread.sleep(5000);
		
		
		//Get Control back to mainpage
		driver.switchTo().defaultContent();
		
		
		//Switch to Another frame
		driver.switchTo().frame("bodyFrame");
		
		//Click Hyper link under bodyframe
		WebElement Disctric_Wise_College_reports_link=driver.findElement(By.xpath("//a[@href='CollegeReport.do']"));
		Disctric_Wise_College_reports_link.click();
		
		
		//Switch to window using Hyper link target property
		driver.switchTo().window("_new");
		Thread.sleep(5000);
		System.out.println("Sub Window title is --> "+driver.getTitle());
		
		
		//Select Dropdown at new window
		Select AYear=new Select(driver.findElement(By.xpath("//select[@id='acyear']")));
		AYear.selectByVisibleText("2016-17");
		
		
		//Switch Controls back to mainwindow
		driver.switchTo().window(MainwindowID);
		System.out.println("Current Foucused window title is ---> "+driver.getTitle());
		
		
	}

}

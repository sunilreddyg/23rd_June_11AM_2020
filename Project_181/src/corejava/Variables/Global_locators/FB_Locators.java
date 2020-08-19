package corejava.Variables.Global_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Locators 
{
	public static By Signin_Email_loc=By.id("email");
	public static By Signin_Pwd_loc=By.id("pass");
	public static By Signin_btn_loc=By.xpath("//button[@data-testid='royal_login_button']");
	
	
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		//Type email
		driver.findElement(Signin_Email_loc).clear();
		driver.findElement(Signin_Email_loc).sendKeys("9030248855");
		
		
		//Type password
		driver.findElement(Signin_Pwd_loc).clear();
		driver.findElement(Signin_Pwd_loc).sendKeys("Hello12345");
		
		//Click login button
		driver.findElement(Signin_btn_loc).click();
		
	}

}

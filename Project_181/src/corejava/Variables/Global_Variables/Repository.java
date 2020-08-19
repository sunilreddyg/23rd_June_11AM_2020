package corejava.Variables.Global_Variables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Repository 
{
	//Global variables
	public WebDriver driver;
	public String Driver_path=null;
	public String url=null;
	public String UID=null;
	public String PWD=null;
	
	//Global locators
	public  By Signin_Email_loc=By.id("email");
	public  By Signin_Pwd_loc=By.id("pass");
	public  By Signin_btn_loc=By.xpath("//button[@data-testid='royal_login_button']");
	
	
	
	
	public void launch_browser()
	{
		System.setProperty("webdriver.chrome.driver", Driver_path);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	
	public void Load_Webpage()
	{
		driver.get(url);
	}
	
	public void Signin()
	{
		driver.findElement(Signin_Email_loc).clear();
		driver.findElement(Signin_Email_loc).sendKeys(UID);
		
		driver.findElement(Signin_Pwd_loc).clear();
		driver.findElement(Signin_Pwd_loc).sendKeys(PWD);
		
		driver.findElement(Signin_btn_loc).click();
	}
	
	public void Close_Browser()
	{
		driver.close();
	}
	
	

}

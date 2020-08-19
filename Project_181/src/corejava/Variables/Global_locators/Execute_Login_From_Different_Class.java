package corejava.Variables.Global_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Execute_Login_From_Different_Class {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		
		//Type email
		driver.findElement(FB_Locators.Signin_Email_loc).clear();
		driver.findElement(FB_Locators.Signin_Email_loc).sendKeys("9030248855");
		
		//Type password
		driver.findElement(FB_Locators.Signin_Pwd_loc).clear();
		driver.findElement(FB_Locators.Signin_Pwd_loc).sendKeys("Hello1234");
		
		//Login Btn
		driver.findElement(FB_Locators.Signin_btn_loc).click();

	}

}

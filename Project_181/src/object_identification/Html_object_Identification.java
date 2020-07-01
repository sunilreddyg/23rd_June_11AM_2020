package object_identification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Html_object_Identification {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();      //Launch browser
		driver.get("https://facebook.com");       //load page to browser
		driver.manage().window().maximize();	  //Maximize browser window
		
		
		
		driver.findElement(By.id("email")).sendKeys("9030248855");
		driver.findElement(By.id("pass")).sendKeys("hello123456");
		driver.findElement(By.xpath("//input[@id='u_0_b']")).click();
	}

}

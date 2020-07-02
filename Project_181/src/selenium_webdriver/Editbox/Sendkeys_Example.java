package selenium_webdriver.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_Example {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();      	//Launch browser
		driver.get("https://gmail.com");       		//load page to browser
		driver.manage().window().maximize();	  	//Maximize browser window
		
		
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId")).sendKeys("qadarshan@gmail.com"+Keys.ENTER);
		Thread.sleep(5000);  //Timegap to load password
		
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("Hello12345"+Keys.ENTER);
	}

}

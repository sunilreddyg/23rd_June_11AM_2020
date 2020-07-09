package selenium_webdriver.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoComplete_Editbox {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();      //Launch browser
		driver.get("http://cleartrip.com");       //load page to browser
		driver.manage().window().maximize();	  //Maximize browser window
		
		//Select Radio button
		driver.findElement(By.id("RoundTrip")).click();
		
		
		//Type Referrence text into Editbox
		driver.findElement(By.id("FromTag")).clear();
		driver.findElement(By.id("FromTag")).sendKeys("HYD");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();
		

		//Type Referrence text into editbox
		driver.findElement(By.id("ToTag")).clear();
		driver.findElement(By.id("ToTag")).sendKeys("DEL");
		Thread.sleep(5000);
		driver.findElement(By.linkText("New Delhi, IN - Indira Gandhi Airport (DEL)")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("23")).click();
		
		//Type Return Date into Editbox [Only Try this when editbox is writable]
		driver.findElement(By.id("ReturnDate")).clear();
		driver.findElement(By.id("ReturnDate")).sendKeys("Fri, 18 Dec, 2020");
		
		
		//Select Number of travellers from Dropdown
		new Select(driver.findElement(By.id("Adults"))).selectByVisibleText("5");
		
		//Click FlightSearch button
		driver.findElement(By.id("SearchBtn")).click();
		
		
		
		
		
		
	}

}

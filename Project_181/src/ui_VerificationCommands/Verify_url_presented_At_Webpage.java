package ui_VerificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_url_presented_At_Webpage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.dev");
		driver.manage().window().maximize();
		
		
		//Capture current window url
		String Act_url=driver.getCurrentUrl();
		String Exp_url="https://www.selenium.dev/";
		
		//Decision to verify Acutal and Expected url
		if(Act_url.contains(Exp_url))
		{
			System.out.println("Expected url presented for selenium homepage");
			
			
			WebElement Downloads_link=driver.findElement(By.xpath("//a[@class='nav-item'][contains(.,'Downloads')]"));
			Downloads_link.click();
			
			
			//Nested condition to verify download page url
			if(driver.getCurrentUrl().contains("downloads/"))
				System.out.println("Download page url presented");
			else
				System.out.println("Download page url mismatch");
			
		}
		else
		{
			System.out.println("Wrong url presented for selenium homepage");
		}
		

	}

}

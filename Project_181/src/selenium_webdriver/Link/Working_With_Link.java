package selenium_webdriver.Link;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Link {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();      		//Launch browser
		driver.get("https://www.cleartrip.com/");       //load page to browser
		driver.manage().window().maximize();	  		//Maximize browser window
		
		
		//Identify link with original linkname
		driver.findElement(By.linkText("About Us")).click();

		//Identify link with original linkname
		driver.findElement(By.linkText("Jobs")).click();
		
		
		//Identify link with original linkname
		driver.findElement(By.linkText("Job Openings")).click();
		
		//Identify link with partial linkname
		driver.findElement(By.partialLinkText("Product Designer")).click();
	}

}

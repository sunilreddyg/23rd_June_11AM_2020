package ui_VerificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Attribute_Runtime_Behaviour {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * 		Scenario:
		 * 				Verifying Nifty tab selection 
		 * 				
		 * 				Given site url "http://content.icicidirect.com/IdirectContent/Markets/MarketOverview.aspx"
		 * 				When click Markets link
		 * 				Then make sure nifty tab is active [or selected]
		 */
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://content.icicidirect.com/IdirectContent/Markets/MarketOverview.aspx");
	    driver.manage().window().maximize();
	    
	    
		WebElement Markets_link=driver.findElement(By.xpath("//a[contains(.,'markets')]"));
		Markets_link.click();
		Thread.sleep(5000);
		
		//Identify Nifty tab
		WebElement Nifty_Tab=driver.findElement(By.id("TradeRec"));
		
		//get Runtime attribute value using attribute name
		String Runtime_class=Nifty_Tab.getAttribute("class");
		
		//Decision to verify Nifty tab selection
		if(Runtime_class.contains("tab-active"))
			System.out.println("Nifty tab selected on browser launch");
		else
			System.out.println("Nifty tab not selected on browser launch");

	}

}

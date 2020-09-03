package switch_commands.Alert;

import org.omg.PortableServer.ThreadPolicyOperations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchTo_Alert_Click_Cancel_Btn {

	public static void main(String[] args) throws Exception {
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();  						//Launch browser
		driver.get("http://demo.automationtesting.in/Alerts.html"); //Load webpage
		driver.manage().window().maximize();  						//maximize browser window
		
		
		WebElement Cancel_TAB=driver.findElement(By.xpath("//a[@href='#CancelTab']"));
		Cancel_TAB.click();
		
		
		WebElement Confirmation_Link=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		Confirmation_Link.click();  //This link prompt confirmation at webpage
		Thread.sleep(5000);   //Wait for alert
		
		
		//This line of code click cancel button at confirmation window
		driver.switchTo().alert().dismiss();
		
		
		//Find info message
		WebElement Info_loc=driver.findElement(By.xpath("//p[@id='demo']"));
		String Info_msg=Info_loc.getText();
		System.out.println("info message displayed is --> "+Info_msg);

	}

}

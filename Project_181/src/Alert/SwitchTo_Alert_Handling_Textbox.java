package switch_commands.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchTo_Alert_Handling_Textbox {

	public static void main(String[] args) throws Exception {
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();  						//Launch browser
		driver.get("http://demo.automationtesting.in/Alerts.html"); //Load webpage
		driver.manage().window().maximize();  		
		
		
		WebElement Textbox_tab=driver.findElement(By.xpath("//a[@href='#Textbox']"));
		Textbox_tab.click();
		
		WebElement Alert_With_Textbox_link=driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		Alert_With_Textbox_link.click();  //This link will prompt alert with textbox
		Thread.sleep(5000);
		
		
		//Type text at editbox inside alert window
		driver.switchTo().alert().sendKeys("Sunilreddy");
		Thread.sleep(3000);
		
		//Accept alert window
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		//Find info message
		WebElement Info_loc=driver.findElement(By.xpath("//p[@id='demo1']"));
		String Info_msg=Info_loc.getText();
		System.out.println("info message displayed is --> "+Info_msg);

				

	}

}

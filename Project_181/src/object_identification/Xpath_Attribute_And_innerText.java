package object_identification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_Attribute_And_innerText {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/free-job-alerts");
		driver.manage().window().maximize();
		
		/*
		 * HtmlSource:-->
		 * 		<input placeholder="Skills, Designations, Roles, Companies">
		 * 
		 *   Xpath Attribute:-->
		 *   		//tagname[@propertyname='Property value']
		 */	
		driver.findElement(By.xpath("//input[@placeholder='Skills, Designations, Roles, Companies']")).sendKeys("software Testing,");
		Thread.sleep(2000);
		
		
		/*
		 * Htmlsource:-->
		 * 		<div tabindex="-1" class="sbtn"> Automation Testing </div>
		 * 	Xpath InnerText:-->
		 * 		//tagname[text()='innerText']
		 */
		driver.findElement(By.xpath("//div[text()='Automation Testing']")).click();
		Thread.sleep(2000);
		
		
		/*
		 * Htmlsource:-->
		 * 		<div tabindex="-1" class="sbtn"> Selenium </div>
		 * 	Xpath InnerText:-->
		 * 		//tagname[.='innerText']
		 */
		driver.findElement(By.xpath("//div[.='Selenium']")).click();
		Thread.sleep(2000);
		
		
		/*
		 * Htmlsource:-->
		 * 		<div tabindex="-1" class="sbtn"> Webdriver </div>
		 * 	Xpath InnerText:-->
		 * 		//tagname[.='innerText']
		 */
		driver.findElement(By.xpath("//div[.='Webdriver']")).click();
		Thread.sleep(2000);
		
		/*
		 * Htmlsource:-->
		 * 		<div class="Sbtn"> Manual Testing </div>
		 * 		Note:--> Identify object with class property when it was duplicated.
		 * 
		 * 	Xpath Duplicate position:-->
		 * 
		 * 				(xpath expression)[int pos]
		 */
		driver.findElement(By.xpath("(//div[@class='Sbtn'])[8]")).click();
		
		
		
		
		
		
	}

}

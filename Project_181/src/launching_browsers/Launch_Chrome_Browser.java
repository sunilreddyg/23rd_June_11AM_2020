package launching_browsers;

import org.openqa.selenium.chrome.ChromeDriver;


public class Launch_Chrome_Browser 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Note:--> WebDriver target chrome browser with help of
		 * 			chromedriver.exe file.
		 * 
		 * Download chromedriver.exe file:-->
		 * 			
		 * 		=> Open site:--> https://chromedriver.chromium.org/downloads
		 * 		=> Find chromedriver version w.r.t chrome browser and click on it
		 * 		=> At index page select OS as windows and download zip format file
		 * 		=> And unzip file, you receive chromedriver.exe file
		 *		=> After download chromedriver.exe file set runtime
		 *		   as runtime environment variable befor launch chrome browser
		 * 
		 * 
		 */
		
		
		//Setting runtime environment variable..
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		ChromeDriver chrome=new ChromeDriver();   //This will trigger your chrome browser
		chrome.get("http://google.com");		  //This will enter load page into browser
		
	}

}

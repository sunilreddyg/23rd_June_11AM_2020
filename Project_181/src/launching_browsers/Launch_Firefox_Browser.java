package launching_browsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Firefox_Browser {

	public static void main(String[] args) {
		/*
		 * Note:--> WebDriver target firefox browser with help of
		 * 			geckodriver.exe file.
		 * 
		 * Download geckodriver.exe file:-->
		 * 			
		 * 		=> Open site:--> https://github.com/mozilla/geckodriver/releases
		 * 		=> Find geckodriver version w.r.t firefox browser
		 * 		=> for firefox 60+ version download  v0.26.0 geckodriver
		 * 		=> Under Geckodriver version select OS as windows and download zip format file
		 * 		=> And unzip file, you receive geckodriver.exe file
		 *		=> After download geckodriver.exe file set runtime
		 *		   environment variable befor launch firefox browser
		 */
		
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		FirefoxDriver firefox=new FirefoxDriver();
		firefox.get("http://facebook.com");

	}

}

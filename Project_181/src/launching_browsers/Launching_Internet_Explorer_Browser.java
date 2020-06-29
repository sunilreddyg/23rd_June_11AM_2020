package launching_browsers;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Launching_Internet_Explorer_Browser {

	public static void main(String[] args) {
		
		/*
		 * downlaod IEDriverServer:-->
		 * 		URL:--> https://www.seleniumhq.org/download/
		 * 		Under The Internet Explorer Driver Server,
		 * 		Downlaod w.r.t hotspot size  32 bit  0r 64 bit.
		 * 
		 * 		Note:-->
		 * 			=> Zoom level should be 100..
		 * 			=> All security and private setting should 
		 * 				be disabled..
		 * 			=> Browser version support IE7,IE8---IE11.
		 * 			=> IEdriverServer we need to download w.r.t 
		 * 				selenium version.	
		 * 
		 */
		
		System.setProperty("webdriver.ie.driver", "Drivers\\chromedriver.exe");
		InternetExplorerDriver ie=new InternetExplorerDriver();
		ie.get("http://google.com");
		
		

	}

}

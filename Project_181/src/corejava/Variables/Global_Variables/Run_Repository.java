package corejava.Variables.Global_Variables;

public class Run_Repository {

	public static void main(String[] args) {
		
		
		//Create object for Repository
		Repository obj=new Repository();
		obj.Driver_path="Drivers\\chromedriver.exe";
		obj.launch_browser();
		
		obj.url="http://facebook.com";
		obj.Load_Webpage();
		
		obj.UID="903024885";
		obj.PWD="Hello12345";
		obj.Signin();

		
		obj.driver.close();
	}

}

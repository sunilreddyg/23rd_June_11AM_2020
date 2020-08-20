package corejava.Conditions;

public class ElseIf_Statements {

	public static void main(String[] args) 
	{
		

		/*
		 * ElseIF:-->
		 * 		Multiple Decisions to Execute
		 */
		
		String browser="chrome";
		
		if(browser.equals("ie"))
		{
			System.out.println("Ie browser launched");
		}
		else if(browser.equals("firfox"))
		{
			System.out.println("firefox browser launched");
		}
		else if(browser.equals("chrome"))
		{
			System.out.println("chrome browser get launched");
		}
		else
		{
			System.out.println("browser name mismatch");
		}
		
		

	}

}

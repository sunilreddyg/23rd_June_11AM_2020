package p1;

public class Computer 
{
	
	void keyboard()
	{
		System.out.println("keyboard is active");
	}
	
	
	static void mouse()
	{
		System.out.println("Mouse is active");
	}
	

	public static void main(String[] args) 
	{
		new Computer().keyboard();   //Calling instant method
		Computer.mouse(); 			//Calling static method
		
		/*
		 * Note:-->
		 * 		=> Because main method contains static "Access Specifier"
		 * 			it allows to call any static method without constructor
		 * 			help..
		 */

	}

}

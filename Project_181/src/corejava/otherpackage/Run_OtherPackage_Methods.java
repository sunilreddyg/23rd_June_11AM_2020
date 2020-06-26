package corejava.otherpackage;

import corejava.instantmethods.RobotA;
import corejava.staticmethods.RobotB;

public class Run_OtherPackage_Methods 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Inorder to call different package methods and variables, We
		 * should follow below instructions.
		 * 
		 * 	=> Only public modifier methods and variable can access
		 * 		outside package.
		 * 
		 *  => we should import other package into current constructed class
		 */
		RobotA obj=new RobotA();
		obj.walk();
		
		
		RobotB.run();

	}

}

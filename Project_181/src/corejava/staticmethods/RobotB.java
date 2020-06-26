package corejava.staticmethods;


public class RobotB 
{

	
	static void walk()
	{
		System.out.println("walk executed");
	}
	
	
	public static void run()  //THis mehtod can access outside package because it contains public modifier
	{
		System.out.println("run executed");
	}
	

	public static void main(String[] args) 
	{
		
		RobotB.walk();
		RobotB.run();
	}

}

package corejava.instantmethods;


public class RobotA 
{
	
	public RobotA()    //Constructor of class
	{
		System.out.println("Robot is active");
	}
	
	void walk()       //Instant method
	{
		System.out.println("Walk executed");
	}
	
    void run()		 //Instant method
	{
		System.out.println("run executed");
	}
	
    public static void main(String[] args) 
	{
		new RobotA();   //Calling constructor of class
		
		new RobotA().walk();   //Calling instant method with help of constructor
		new RobotA().run();
	
	}

}

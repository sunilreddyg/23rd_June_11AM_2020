package corejava.instantmethods;


public class RobotA 
{
	
	public RobotA()    //Constructor of class
	{
		System.out.println("Robot is active");
	}
	
	public void walk()       //Instant method  [This method can access outside package,Because it has public modifier]
	{
		System.out.println("Walk executed");
	}
	
    void run()		 //Instant method          [This method can access only with in package,Because it don't have public modifier]
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

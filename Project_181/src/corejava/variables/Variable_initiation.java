package corejava.variables;

public class Variable_initiation {

	public static void main(String[] args)
	{
		
		
		//local initiation [When variable declared Inside method we can't access outside method]
		int a=100;
		System.out.println("value is => "+a);
		
		
		//Global Variable
		int b=200;
		b=300;  
		
		
		/*
		 * 		variabel initiation with conditions
		 */
		
		int c;  //Variable Initiation Outside a Condition
		if(true)
		{
			c=400;
		}
		System.out.println("Global value is "+c);
		
		
		//Variable with global initiation
		int d=11;
		if(d==10)
		{
			d=100;
		}
		else
		{
			d=200;
		}
		System.out.println("Final d value is => "+d);
		
		//Variable initiation with loops
		int e=1;  //Global variable for [Loop]
		for (int i = 0; i <= 10; i++) 
		{
			String name="MQ";
			System.out.println("Loop inside local variable => "+name);
			e=e+i;   
		}
		System.out.println("total value is => "+e);
		

				
				

	}

}

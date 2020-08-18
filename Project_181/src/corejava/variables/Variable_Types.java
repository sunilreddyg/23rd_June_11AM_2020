package corejava.variables;

public class Variable_Types 
{

	
		public String email="info@mindq.com";  //Global variable with public modifier[It can access ouside package anwhere with in project]
		String username="Arjun";   			//Instant variable [The variable witout static Access Specifier]
		static String password="12345";     //Class Variable   [The variable with static Access specifier]
		final String AccessCode="10001";   //Final keyword doesn't allow variable value to change at runtime.
		
		public void method1()
		{
			String name="MQ";   //Local Variable [Because it declared inside method]
			System.out.println(name);
		}
		
		public void method2()
		{
			//Printing global variables..
			System.out.println("Instant Varaible is =>"+username);
			System.out.println("Class Varaible is => "+password);
		}
		
		public static void method3()
		{
			//Static Methods or variables we can call directly
			System.out.println("static variable is => "+password);
			
			//Otherthan static variables to call Inside a static method
			String UID=new Variable_Types().username;
			System.out.println("Calling Instant variable From Static Method => "+UID);
		}
		
		

		public static void main(String[] args) 
		{
			
			//Calling Instant methods
			Variable_Types obj=new Variable_Types();
			obj.method1();
			obj.method2();
			
			//Global variables accept runtime changes
			String user=obj.username="Sunil";
			System.out.println(user);
			
			String pwd=password="Hello123";
			System.out.println(pwd);
			
			//We cant change final variable at runtime
			String Acs=obj.AccessCode;
			System.out.println(Acs);
			
			//Calling Class Method
			method3();
			
			
			

		}

	

}

package corejava.Conditions;

public class SwitchCase_Statement {

	public static void main(String[] args) 
	{
		
		/*
		 * Switch-case:-->
		 * 		=> switch execute multiple decisions same
		 * 			as else if. only diff switch execute
		 * 			only selected case instead verifing
		 * 			everfy case. 
		 */		
		
		
		int num=2;
		
		switch (num) 
		{
		case 1:
			System.out.println("Number 1 executed");
			break;
			
		case 2:
			System.out.println("Number 2 executed");
			break;
			
		case 3:
			System.out.println("Number 3 executed");
			break;
			
		case 4:
			System.out.println("Number 4 executed");
			break;

		default:System.out.println("Number mismatch");
			break;
		}
		
		
		
		//Switch case with String key..
		
		String month="feb";
		
		switch (month) 
		
		{
		case "jan":
				System.out.println("jan executed");
			break;
			
		case "feb":
			System.out.println("feb executed");
			break;
		
		case "mar":
			System.out.println("mar executed");
			break;

		default: System.out.println("month name mismatch");
			break;
		}
		
		
		
		
		

	}

}

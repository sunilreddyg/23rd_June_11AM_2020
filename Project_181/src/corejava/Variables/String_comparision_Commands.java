package corejava.Variables;

public class String_comparision_Commands {

	public static void main(String[] args) 
	{
		
		/*
		 * String:--> 
		 * 			=> String is a non-primitive datatype
		 * 			=> String store set of characters
		 * 			=> String is not only a datatype and also called as class.
		 * 			   Because string class contains set of events to validate
		 * 			   stored characters.
		 */
		
		
		String name="MQ-DSNR";
		System.out.println("Characters length is => "+name.length());
		
		
		
		/*
		 * Equals:-->
		 * 			Method verify equal comparision of any two strings and return boolean value 
		 * 			true/false. This comparision is case-sensitive.
		 */
		String Act_res="Account Created";
		String Exp_res="account created";
		
		boolean flag=Act_res.equals(Exp_res);
		System.out.println("Equal comparision is=> "+flag);
		
		
		/*
		 * EqualsIgnorecase:-->
		 * 			Method verify equal comparision by ignoring case-sensitive and return
		 * 			boolean value true/false.
		 */
		boolean flag1=Act_res.equalsIgnoreCase(Exp_res);
		System.out.println("Equalignore case comparision is => "+flag1);
		
		
		/*
		 * contains:-->
		 * 		 Method verify sub-sequent characters presented at main String
		 * 		 and returb boolean value true/false.
		 */
		String Status="Account 100 Created Successfull";
		boolean flag2=Status.contains("Account");
		boolean flag3=Status.contains("Created");
		boolean flag4=Status.contains("101");
		System.out.println("Account exist is -> "+flag2);
		System.out.println("Created exist is -> "+flag3);
		System.out.println("101 exist is -> "+flag4);
		
		
		/*
		 * length:-->
		 * 			Method verify length of characters and return numeric value
		 */
		String Account_num="3084083048348444";
		int len=Account_num.length();
		System.out.println("Account number length available is => "+len);
		
		
		
		/*
		 * subString:-->
		 * 		Method return subString characters from main String
		 */
		String Mobile_num="9030248855";
		String First_Digits=Mobile_num.substring(0, 5);
		System.out.println("Mobile number first five digits are => "+First_Digits);
		
		String Last_digits=Mobile_num.substring(5);
		System.out.println("Mobile number last five digits are => "+Last_digits);
		
		
		
		/*
		 * isEmpty:-->
		 * 		Method verify any characters availability of string and return
		 * 		boolean value true/false.
		 */
		String val="Hello";
		String val1="";
		System.out.println("val empty status is => "+val.isEmpty());
		System.out.println("val1 empty status is => "+val1.isEmpty());
		
		
		/*
		 * touppercase:-->
		 * 		Method convert lowercase characters into uppercase
		 */
		String Toolname="webdriver";
		System.out.println("Toolname is uppercase is => "+Toolname.toUpperCase());
		
		
		/*
		 * tolowercase:-->
		 * 		Method convert uppercase characters into lowercase
		 */
		String IFSC_Code="HDFC0001234";
		System.out.println("IFSC code in lowercase is => "+IFSC_Code.toLowerCase());
		
		
		
		/*
		 * trim:-->
		 * 		Method trim extra spaces available with in String
		 */
		String pincode="    500060    ";
		System.out.println("Pincode length before trim => "+pincode.length());
		String New_pincode=pincode.trim();
		System.out.println("Pincode value after trim is => "+New_pincode.length());
		
		
		
		/*
		 * CharAt:-->
		 * 		Method get any single characters using index number and store
		 * 		single character into char datatype.
		 */
		String Group="ABC";
		char ch=Group.charAt(1);
		System.out.println("2nd index character is -> "+ch);
		
		
		
		/*
		 * split:-->
		 * 		Method split characters using delimeted value and store
		 * 		values into array format
		 */
		String UID="Arjun,Abhinav,Bhavesh,Raju,Gopal,Vedha,Vinnela,Harish";
		String Usernames[]=UID.split(",");
		System.out.println(Usernames[0]+"    "+Usernames[1]+"    "+Usernames[2]);
		
		
		
		/*
		 * Startswith:-->
		 * 			Method verify given characters starts with expected characters and
		 * 			return boolean value true/false
		 */
		String Code="HDFC001";
		boolean flag5=Code.startsWith("HDFC");
		System.out.println("Code starts with HDFC characters -> "+flag5);
		
		
		/*
		 * Endswith:-->
		 * 			Method verify given characters Ends with expected characters and
		 * 			return boolean value true/false
		 */
		String Result="Tc001_Testpass";
		boolean flag6=Result.endsWith("Testpass");
		System.out.println("Result Ends with HDFC characters -> "+flag6);
		
	}

}


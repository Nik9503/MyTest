package ControlStatements;

public class NestedIfElseStudy {

	public static void main(String[] args)	
	{
		
		// if user name is correct---> Enter password
		// if--> password is correct-->login success
		// else--> enter correct password
		//else -->enter correct user name
         
		String user = "Flipcart";
		String pass = "Pune11#";
		
		if (user=="Flipcart") 
		{
			System.out.println("Please enter your password");
			
			if (pass=="Pune11#") 
			{
		     System.out.println("Loging success");
			}
			
			else 
			{
			System.out.println("Password is incorrect");	
			}
		}
		
		else 
		{
			System.out.println("Please enter correct username");
		}
	}

}

package ControlStatements;

public class ElseIftudy {

	public static void main(String[] args) {


		//if your marks>= 75----> you are in dist.
		//else if your marks>=60<75----> you are in 1  class
		//else if your marks>=40<60-----> you are in 2nd class
		//else if your marks>=35<40-----> you are just pass
		//else -----> you just pass
		
		int marks = 76;
		if (marks>=75) 
		{
		  System.out.println("You are in dist.");	
		}
		else if (marks>=60 & marks<75) 
		{
		  System.out.println("You are in 1st class");	
		}
		
		else if (marks>=40 & marks<60) 
		{
		  System.out.println("You are in 2nd class");
		 
		}
		else if (marks>=35 & marks<40) 
		{
		  System.out.println("You are just Passed");	
		}
		else 
		{
		  System.out.println("You are fail");	
		}
	}

}

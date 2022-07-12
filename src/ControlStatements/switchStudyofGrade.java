package ControlStatements;

public class switchStudyofGrade {

	public static void main(String[] args)
	{
	  char Grade = 'B';
	  
	  switch (Grade) 
	  {
	  case 'A': System.out.println(" You pass in A grade ");
		break;
	  case 'B': System.out.println(" You pass in B grade ");
		break;
	  case 'C': System.out.println(" You pass in C grade ");
		break;
	  case 'D': System.out.println(" You pass in D grade ");
		break;
	  default: System.out.println(" Error");
		break;
	}

	}

}

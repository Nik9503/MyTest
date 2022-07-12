package ControlStatements;

public class SwitchStudy {

	public static void main(String[] args)
	{
			// Year 1--> Welcome to 1st year engg
			// Year 2--> Welcome to 2nd year engg
			// Year 3--> Welcome to 3rd year engg
			// Year 4--> Welcome to 4th year engg
			// Year default--> Please enter year between 1-4
		
		int years = 2;
		
		switch (years) 
		{
		case 1: System.out.println("well come to 1st year of engineering");
			break;
		case 2 :System.out.println("Well come to 2nd year of engineering");
		    break;
		case 3 : System.out.println("Well come to 3rd year of engineering");
            break;
		case 4 : System.out.println("Well come to 4th year of engineering");
			break;
			
		default: System.out.println(" Please print / enter between 1-4 ");
			break;
		}
		

	}

}

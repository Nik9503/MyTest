package ControlStatements;

public class swithchStudy1 {

	public static void main(String[] args)
	{
	String city = "BOM";
	
	switch (city) 
	{
	case "AMT":System.out.println("Well come to Amravati airport");
		break;
	
	case "BOM":System.out.println("Well come to Mumbai airport ");
	break;
	
	case "NGP": System.out.println("Well come to Nagpur airport");
	break;
	
	default:System.out.println("Please enter valid code between 1 - 2 ");
	}

	}

}

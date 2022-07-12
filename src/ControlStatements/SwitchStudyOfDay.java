package ControlStatements;

public class SwitchStudyOfDay {

	public static void main(String[] args) 
	{
		String days = "tue";
		
		switch (days) 
		{
		case "monday":System.out.println("Today is monday 1st day of office ");
			break;
		case "tuesday" :System.out.println("Today is tuesday 2nd day of office ");
		    break;
		case "wednesday" :System.out.println("Today is wednesday 3rd day of office");
		    break;
		case "thursday" : System.out.println("Today is thursday 4th day of office");
		   break;
		case "firday" : System.out.println("Today is firday 5th day of office");
		   break;
		case "saturday" : System.out.println("Today is saturday 6th day of office");
		   break;
		case "sunday" : System.out.println("Today is sunday 7th day of office");
		   break;
		default:System.out.println(" Error");
			break;
		}

	}

}

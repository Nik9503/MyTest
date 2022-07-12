package ControlStatements;

public class If_elseStudy {

	public static void main(String[] args) 
	
	{
       // if mark is grater than 60 ---->> now you passed
		
		int marks = 70	;
	    String cityname = "Pune";
	    float percentage=20;
	    int packages = 12;
	    
	    if (packages>=11)
	    	
	    	System.out.println("It is true and you got 11 Lack package");
	    
	    
	    if (percentage>=35)
	    	System.out.println("You are passed");
	    
	    if (cityname=="Pune")
	    System.out.println("City name is "+ cityname);
		
		if(marks>60)
		{
			System.out.println("You are Passed");
		}
		else
		{
        	 System.out.println("You are failed");
         }

	}

}

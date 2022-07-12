package Casting_study;

public class UpCastingTest 
{

	public static void main(String[] args) 
	{
		
		Son S = new Son();
		S.bike();
		S.car();	
		S.Degree();
		
		Father F= new Father(); 
		F.bike(); 
		F.car();  
		
		
		Father F1= new Son(); // creating object of subclass and giving superclass reference
		F1.bike(); //eligible for casting
		F1.car();  //eligible for casting
		//F.Degree();//not eligible for casting as its not common/ superclass method


	}

}

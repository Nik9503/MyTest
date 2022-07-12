package Casting_study;

public class Primitive_Casting {

	public static void main(String[] args) 
	{
		int a=20; //lower data type information
		System.out.println(a);
		
		double b=a; //converted to higher data type info-- Implicit casting or  widening casting
		System.out.println("---------------------------");
		System.out.println(b);
		
		double c= 20.456; //Higher data type
		System.out.println("---------------------------");
		System.out.println(c);
		
		int d = (int) c; //converted to lower type info--explicit casting or narrowing casting
		System.out.println("---------------------------");
		System.out.println(d);
		
	}

}

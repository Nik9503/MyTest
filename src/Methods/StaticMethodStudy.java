package Methods;

public class StaticMethodStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		myMethod(); //	calling static regular method form same class
		myMethod1(); // calling static regular method form same class
		
		Methodclass2.display();  //	  calling static regular method form another class
		Methodclass2.display2();  //  calling static regular method form another class
		
		Methodclass3.display3();  //	calling static regular method form another class
		Methodclass3.display4();  //    calling static regular method form another class
		
	}

	
	public static void myMethod()
	
	{
		System.out.println("Hi this is my practice session of method");
	}

	public static void myMethod1()
	{
		System.out.println("Hi this is my1st method practic");
	}
	
}

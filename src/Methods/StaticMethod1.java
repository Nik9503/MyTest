package Methods;

public class StaticMethod1 {

	public static void main(String[] args) 
	
	{
		show();
		StaticMethod1 vaibhav= new StaticMethod1();
		vaibhav.display();
		Static2.vaibhav();    //from another class
		Static2 ST = new Static2();
		ST.nikhil(); //// from another class
		
		

	}
    public static void show()
    {
    	System.out.println("This is static method");//from same class
    }
    public void display()
    {
    	System.out.println("This is non-static method");
    }
    
}

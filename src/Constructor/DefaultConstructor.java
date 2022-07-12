package Constructor;

public class DefaultConstructor {

	{
		
	}
	
	public static void main(String[] args) 
	{
		DefaultConstructor DC = new DefaultConstructor();
		 DC.myMethod();
	}
	public void myMethod()
	{
		System.out.println("This Is Default Constructor value and NON- Static Method" );
	}
	
	
}

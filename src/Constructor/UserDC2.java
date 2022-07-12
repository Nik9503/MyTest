package Constructor;

public class UserDC2 {
	
	
	public UserDC2()                  //- user defined without/ zero parameter constructor
	
	{
		System.out.println("I am user define constructore ");
		int a = 100;
		int b = 200;
	    System.out.println("Value of A is = "+ a);
	    System.out.println("Value of B = "+ b);
	}

	public static void main(String[] args) 
	
	{
		UserDC2 ud2 = new UserDC2();
		ud2.test();

	}

	public void test()
	
	{
		System.out.println("Hi this is my constructore test method" );
	}
}

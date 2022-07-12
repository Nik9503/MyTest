package Constructor;

public class CC1ZeroPearameter {
	
	int a;  //variable declaration
	int b;  //variable declaration
	
	public CC1ZeroPearameter()  	//User define zero parameter 	
	
	{
		a= 10;   // initialize variable
	    b= 20;   // initialize variable
	}

	public static void main(String[] args) 
	{
		CC1ZeroPearameter CC1P = new CC1ZeroPearameter();
		CC1P.add();
		CC1P.sub();
	}

	public void add ()
	{   int sum = a+b; 
		System.out.println("Amount Addition is= "+ sum);
	}
	
	public void sub()
	{
		int sub = a-b;
		System.out.println("Amount substraction is= "+ sub);		
	}
}

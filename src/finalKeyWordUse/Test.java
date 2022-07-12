package finalKeyWordUse;

public  class Test //used final before class
{

	public static void main(String[] args)
	{
		int a=10;
		a=a+20;
		System.out.println("A vlue is "+a);
		
		final int b=20;
		//b=b+20; if we make any variable as final then we cant update the value again
		
		int sum=a+b;
		System.out.println("Sum of B "+ sum);
	}
	
	public  void demo()
	{
		System.out.println(" Hi i am demo method of Test Class");
	}

}

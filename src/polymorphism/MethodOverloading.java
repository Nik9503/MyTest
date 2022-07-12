package polymorphism;

public class MethodOverloading {

	public static void main(String[] args)
	{
		MethodOverloading M = new MethodOverloading();
		M.add();
		M.add(20, 50);
		M.add(30, 57, 60);

	}
	
	public void add()
	{
		int a = 10;
		int b = 20;
		int sum = a+b;
		System.out.println(" Sum is "+ sum);
	}
	
	public void add(int a, int b)
	{
		int sum=a+b;
		System.out.println("Sum is "+sum );
	}
	
	public void add(int a, int b, int c)
	{
		int sum=a+b+c;
		System.out.println("Sum is "+sum );
	}

}

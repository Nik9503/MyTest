package InterfaceStudy;

public class MyClass implements MyInterface
{

	public static void main(String[] args) 
	{
		MyClass MC = new MyClass();
		MC.test();
		MC.test1();
		MC.myMethod();

	}

	@Override
	public void test() 
	{
		System.out.println("HI this method completed in implementation class ");
		
	}

	@Override
	public void test1() 
	{

		System.out.println("HI this method completed in implementation class");
	}
	public void myMethod()
	{
	System.out.println("This is myClass method");
	}

}

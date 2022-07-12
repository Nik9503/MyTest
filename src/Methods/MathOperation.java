package Methods;

public class MathOperation {

	public static void main(String[] args) 
	{
		
	MathOperation MO= new MathOperation();
	 MO.add();
	 test();
	 test.mul();
	 test t = new test();
	 t.div();
	 
	

	}

	public void add()
	
	{
		int a=100;
		int b=200;
		int addition = a+b;
		System.out.println("------------------------------");
		System.out.println("Addition Value is= "+ addition);
		System.out.println("------------------------------");
	}
	
	public static void test()
	{
		int a=200;
		int b=100;
		int sub = a-b;
		System.out.println("Subtraction Value is= "+ sub);
		System.out.println("------------------------------");
	
	}
}


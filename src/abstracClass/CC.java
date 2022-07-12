package abstracClass;
 
public class CC extends AbstracStudy
{

	public static void main(String[] args) 
	{
		CC C = new CC();
		C.test1();
		C.test();
		C.test2();
		C.sample();
		C.test3();
	
		
	}
	
	public  void test()
	{
		System.out.println("XYZ");
	}
	public void test3()
	{
		System.out.println(" This method is complete with concrete class");
	}
	
	public void sample()
	{
		System.out.println("This is own method of cc");
	}
}

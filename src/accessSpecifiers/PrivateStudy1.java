package accessSpecifiers;

public class PrivateStudy1 {

	public static void main(String[] args) 
	{

		case1();
		case2();
		case3();
		case4();

	}

	private static void case1 ()
	{
		System.out.println(" This Is Private 1 ");
	}
	static void case2 ()
	{
		System.out.println(" This Is default 2 ");
	}
	protected static void case3 ()
	{
		System.out.println(" This Is protected 3 ");
	}
	public static void case4 ()
	{
		System.out.println(" This Is Public 4 ");
	}
}

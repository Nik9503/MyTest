package ThisAndSuperKeywordUse;

public class SuperUse extends ThisUse
{
	
	int a = 500; //non static global variable(from subclass)

	public static void main(String[] args) 
	
	{
		SuperUse su= new SuperUse();
		su.sub();

	}
	
	public void sub() 
	{
		int a=800;
		int sub=a-70;// using local value of a
		System.out.println("Sub is "+sub);
		
		int sub1=this.a-70;// using global value of a from same class
		System.out.println("Sub1 is "+sub1);
		
		int sub2=super.a-70;// using global value of a from super class
		System.out.println("Sub2 is "+sub2);
	}
}

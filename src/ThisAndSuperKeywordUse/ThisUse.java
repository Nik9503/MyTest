package ThisAndSuperKeywordUse;

public class ThisUse {
	
	int a=100;
	int b=600;
	static int c=10; //Static global variable

	public static void main(String[] args) 
	{
		ThisUse T = new ThisUse();
		T.condition();
		


	}

	public void condition() 
	{
		int a= 10; // local variable
		//static int c=190; we cant create static variable with same name in same class
		
		int sum = a+900; // a value will be reffred as local value'10'
		System.out.println("Addition is "+sum);
		
		int sum1 = this.a+900; // calling global value of a using this keyword
		System.out.println("Addition is "+sum1);
		
		System.out.println("Local value of a is " + a); 
		System.out.println("Globle value of a is "+ this.a);
		
		
	}
}

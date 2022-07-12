package Variable_types;

public class GlobalVariable {

	int a= 10;   	//global non static variable
	static int b= 20;  //global static variable 
	
	
	
	public static void main(String[] args) 
		{
         GlobalVariable GB = new GlobalVariable();
        		 GB.test();
        		 
        System.out.println("Value of A is = "+ GB.a);   // calling non static global variable -->objectname.variable name	 
        System.out.println("Value of B is = "+ b);      // calling static global variable from same class--> variable name
        
        Sample s = new Sample();
        System.out.println("global non-static variable from another class is "+ s.p);
        System.out.println("gloabal static variable from another class "+ Sample.q);
        
        int sub= 800-GB.a;
        int sub1 = 450-b;
        
        int sub2 = 350-s.p;
        int sub3 = 3000-Sample.q;
        
        System.out.println("sub is =" + sub);
        System.out.println("sub is =" + sub1);
        System.out.println("sub is =" + sub2);
        System.out.println("sub is =" + sub3);
	}

	
	public void test()// non-static method
	{
		//int a=450; // Local Variable
		//int sum = a+10;  //we can call non-static global variable
		//int sub = b-10; //we can call static global variable
    }
	
	public static void test1 ()  //static method
	{
		//int sub= b-10;      // we can call static global variable
		
		//int sum=a+10;// we cant call non-static global variable
	}
	
}


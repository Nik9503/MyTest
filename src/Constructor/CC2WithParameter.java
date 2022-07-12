package Constructor;

public class CC2WithParameter 
{

	int n;                        //variable declaration
	int p;                        //variable declaration
	int e;
	
	public CC2WithParameter()     //EX. user defined zero parameter constructor
	
	{   
		n=30;                     //initialize variable
		p=40;                     //initialize variable
		e=10;
	}
	
	public CC2WithParameter(int x)  //EX. user defined single parameter constructor
	{
		n=x;
	}
	public CC2WithParameter(int x, int y)  //EX. user defined double parameter constructor
	{
		n=x;
		p=y;
	}
	public CC2WithParameter(int x, int y, int z)  //EX. user defined tripple parameter constructor
	
	{
		n=x;
		p=y;
		e=z;
	}
	
	
	
	
	public static void main(String[] args) 
	
	{
		CC2WithParameter CC2P = new CC2WithParameter();
		CC2P.add();
		
		CC2WithParameter CC2W01 = new CC2WithParameter(50);
		CC2W01.add();
		
		CC2WithParameter CC2W02 = new CC2WithParameter(100,200);
		CC2W02.add();

		CC2WithParameter CC2W03 = new CC2WithParameter(10,20,30);
		CC2W03.add();
	}

	public void add()
	{
		int sum = n+p;
		System.out.println("Sum is= " + sum );
	}
}

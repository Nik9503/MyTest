package arrays;

public class LongArray {

	public static void main(String[] args) 
	{
		long mob[] = new long[5];
		
		mob[0]= 8574698547l;
		mob[1]= 8785428747l;
		mob[2]= 9503552893l;
		mob[3]= 7030089618l;
		mob[4]= 4555727634l;
		
		for (int i = 0; i<= 4 ; i++)
		{
			System.out.println(mob[i]);
		}
		System.out.println("****************************************");
		
		for (int i = 4; i>= 1 ; i--)
		{
			System.out.println(mob[i]);
		}
		
	}

}

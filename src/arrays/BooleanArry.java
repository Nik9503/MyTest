package arrays;

public class BooleanArry {

	public static void main(String[] args) 
	{
		boolean result[] = new boolean[2];
		
		result[0]= true;
		result[1]= false;
		
		for (int i=0; i<= 1; i++)
		{
			System.out.println(result[i]);
			
		}
		System.out.println("************************************");
		
		for (int i=1; i>=0; i--)
		{
			System.out.println(result[i]);
			
		}
	}

}

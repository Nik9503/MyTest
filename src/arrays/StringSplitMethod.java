package arrays;

public class StringSplitMethod {

	public static void main(String[] args) 
	{
		String J = " I LOVE MY INDIA";
		
		String ar[]= J.split(" ");
		
		for (int i=0; i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}

	}

}

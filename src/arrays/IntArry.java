package arrays;

public class IntArry {

	public static void main(String[] args)
	{
		int age[] = new int[5];
		
		age[0]=28;
		age[1]=32;
		age[2]=39;
		age[3]=45;
		age[4]=57;
		
		for (int i=0; i<=4; i++)
		{
			System.out.println(age[i]+ "Years");
		}
		System.out.println("***********************************");
		
		for (int i=4; i>= 0; i--)
		{
			System.out.println(age[i]+ "Years");
		}
	}

}

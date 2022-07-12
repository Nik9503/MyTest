package arrays;

public class CharArray {

	public static void main(String[] args) 
	{
		char classgroup[] = new char[5];
		
		classgroup[0]= 'A';
		classgroup[1]= 'B';
		classgroup[2]= 'C';
		classgroup[3]= 'D';
		classgroup[4]= 'E';
		
		//3. USAGES
		
		for (int i = 0; i<=classgroup.length-1; i++)
		{
			System.out.println(classgroup[i]);
		}
		
		System.out.println("==========================================");
		
		for (int i = classgroup.length-1; i>=0; i--)
		{
			System.out.println(classgroup[i]);
		}
			
				
	}

}

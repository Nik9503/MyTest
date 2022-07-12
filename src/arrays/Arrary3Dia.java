package arrays;

public class Arrary3Dia {

	public static void main(String[] args) 
	{
		int rollNo [][] = {{56,24,25},{20,30,50},{70,20,40}};
		
		for ( int i = 0; i<=2; i++) //for row
		{
			System.out.println(" ");
		{
			for (int j = 0; j<=2; j++)
			{
				System.out.print(rollNo[i][j] + "    ");
			}
			 System.out.println();
			 
		}
		}
	}

}

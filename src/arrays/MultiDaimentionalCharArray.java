package arrays;

public class MultiDaimentionalCharArray {

	public static void main(String[] args) 
	{
		
		char grade[][]= {{'A', 'B'},{'C', 'D'}};
		for(int i=0;i<=grade.length-1;i++)// this outer loop for rows
		{
		for(int j=0;j<=grade.length-1;j++)// this is inner loop for columns
		{
		System.out.print(grade[i][j]+" ");
		}
		System.out.println();
		}

	}

}

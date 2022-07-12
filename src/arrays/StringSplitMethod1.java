package arrays;

public class StringSplitMethod1 {

	public static void main(String[] args) {
		
		//String name="THIS_IS_MY_COUNTRY";
		
		String s = "THIS IS MY COUNTRY";
		
		String ar []= s.split(" ");
		
		for (int i=0; i<=ar.length-1; i++)
		{
			System.out.print(ar[i] + " ");
			
		}
		//name ="THIS_IS_MY_COUNTRY";
	}

}

package arrays;

public class FloatArry {

	public static void main(String[] args)
	{
		float waight[] = new float[5];
		
		waight[0]=89.3f;
		waight[1]=95.7f;
		waight[2]=78.2f;
		waight[3]=72.8f;
		waight[4]=78.3f;
		
		for (int i=0; i<=4; i++)
		{
			System.out.println("Sachin Waighg is " + waight[i]+ "KG");
		}
		
		System.out.println("=============================================");
		
		for (int i = 4; i>=0; i--)
		{
			System.out.println("Sachin waigth is "+ waight[i]+ "KG");
		}
			
	}

}

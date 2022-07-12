package arrays;

public class ArrayStudy1 {

	public static void main(String[] args)
	{
		//sachin , Vaibhav , Atul
		
		// Array decleration 
		
		String name[]= new String[4];
		
		name[0]= "sachin";
		name[1]= "Vaibhav";
		name[2]= "Atul";
		name[3]= "Akashy"; 
		
		//usage
		
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		System.out.println(name[3]);
		
		System.out.println("================================");
		
		
		
		
			for(int i=0;i<=3;i++)
			{
			System.out.println(name[i]);
			}
			System.out.println("=====================");
		
		
			for(int i=0;i<=name.length;i++) // methods
			{
			System.out.println(name[i]);
			}
			System.out.println("=====================");
			
			for (int i = name.length-1; i>=0;i--) //Dynamic Methods
			{
				System.out.println(name[i]);
			}
			System.out.println("=====================");
	
		

		

	}

}

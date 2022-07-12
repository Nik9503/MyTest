package accessSpecifiers;

public class PrivateStudy {

	public static void main(String[] args) 
	
	{
		PrivateStudy PS = new PrivateStudy();
		PS.book1();
		PS.book2();
		PS.book3();
		PS.book4();
		
	}

	private void book1()
	{
		System.out.println("This Is Private method Book 1");
	}
	void book2 ()
	{
		System.out.println("This Is Default method from Book2");
	}
	 protected void book3 ()
	 {
		 System.out.println("This Is Protected method from Book3");
	 }
	 public void book4()
	 {
		 System.out.println("This Is Public method from Book4");
	 }
	 
	
}

package Methods;

public class NonStaticMethodStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NonStaticMethodStudy obj= new NonStaticMethodStudy();
		
		obj.display();
		
		NonStaticNewClass A = new NonStaticNewClass();
		
		A.class1();
		
		
	}

	public void display()
	
	{
		System.out.println("This my non- static display method study");
	}
}

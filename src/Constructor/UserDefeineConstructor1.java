package Constructor;

public class UserDefeineConstructor1 {

	//Example of user define constructor (Manually)
	
	String name = "BAL-C";           // variable declaration manually with initialization
	String address = "Pune";         // variable declaration manually with initialization
	int pinCode = 410501;            // variable declaration manually with initialization      
	int qty = 32145;                 // variable declaration manually with initialization
	int num = 2;                    // variable declaration manually with initialization
	
	            // ((use of constructor --> to initialize variable))
	
	
	public static void main(String[] args) 
	{
		UserDefeineConstructor1 uc1 = new UserDefeineConstructor1();                 //Main body
		uc1.Company();
		uc1.company1();
	}

	public void Company()
	
	{
		System.out.println("Company Name Is=" + name);                               //Usages
		System.out.println("Company Address Is= "+ address);                         //Usages
		System.out.println("Company Pincode Is= "+ pinCode);                         //Usages
		System.out.println("Company Production Quentaty Is= "+ qty + "/Week");       //Usages
	}
	
	public void company1()
	{
		System.out.println("Company Working Shift Is =" + num);
	}
}

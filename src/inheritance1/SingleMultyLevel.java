package inheritance1;

public class SingleMultyLevel {

	public static void main(String[] args) 
	{
		Bank B = new Bank();
		B.branch();
		
		Customer C = new Customer();
		C.account();
		C.branch();
		C.SBI();
		
	}

}

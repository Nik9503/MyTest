package generalization;

public class TestGeneralization {

	public static void main(String[] args) 
	{
		
		Jio j = new Jio();
		System.out.println("======JIO=========");
		j.call();
		j.data();
		j.msg();
		j.NewMethod_Jio();
		System.out.println("======JIO=========");
		
		Airtel a = new Airtel();
		System.out.println("======AIRTEL=========");
		a.call();
		a.data();
		a.msg();
		a.NewMethod_Airtel();
		System.out.println("======AIRTEL=========");
		
		vi v = new vi();
		System.out.println("======VI=========");
		v.call();
		v.data();
		v.msg();
		v.NewMethod_VI();
		System.out.println("======VI=========");


	}

}

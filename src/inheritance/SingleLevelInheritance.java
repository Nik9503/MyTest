package inheritance;

public class SingleLevelInheritance {

	public static void main(String[] args) 
	{
		//to call mothers non static property I need mothers object
        Mother m = new Mother();
        m.nature();
        Mother.care();
        
        
        Child c= new Child();
        c.mobile();
        Child.Laptop();
        
        c.nature();
        Child.care();
        Child.Laptop();
	}
	

}

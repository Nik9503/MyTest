package Constructor;

public class Udwithpara {

	
		String Name ="sagar";
		String Address="pune";
		long AccountNum=123545678902L;
		int Pincode=415539;
	 public Udwithpara()
	 {
		 
	 }
		public static void main(String[] args) {
			 Udwithpara ud = new Udwithpara();
			 ud.Udwithpara1();
	         Udwithpara ud1=new Udwithpara();
	         ud1.Udwithpara1("rahul", "satara", 45678901234L, 415345, 4125);
	         Udwithpara ud2=new Udwithpara();
	         ud2.Udwithpara1("rohit", "Mumbai", 678905432101L, 415768,1254);
	         Udwithpara ud3=new Udwithpara();
	         ud3.Udwithpara1("Nikhil","Amravati",1234567852L, 140501,4785);
	         Udwithpara ud4=new Udwithpara();
	         ud4.Udwithpara1("Ashshi", "Nagpur", 703008964700L,444606,9875 );
	         
		}
	     public void Udwithpara1()// name,address,account number,pincode 
	  {
	    	 System.out.println("******");
	    	 System.out.println("name of account holder is "+Name);
	    	 System.out.println("address of account holder is "+Address);
	    	 System.out.println("account number of account holder is "+AccountNum);
	    	 System.out.println("pincode of account holder is "+Pincode);
	  } 
	     public void Udwithpara1(String Name,String Address,long AccNUM,int Pincode,double numb)
	     {
	    	 System.out.println("******");
	    	 System.out.println("name of account holder is "+Name);
	    	 System.out.println("address of account holder is "+Address);
	    	 System.out.println("account number of account holder is "+AccountNum);
	    	 System.out.println("pincode of account holder is "+Pincode);
	    	 System.out.println("Account IFSC no is "+ numb);
	     }
	}
	

		

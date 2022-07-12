package Methods;

public class HospitalList {

	public static void main(String[] args) 
	{
     HospitalList HL = new HospitalList();
     HL.PatientInfo("Nuron", "Sudarshan Ingle", "Dhantoli Garden", "Nagpur", 'O', 72, 'M', 7030089618l);
     HL.PatientInfo("Shatayu", "Prachi Ingle", "Chakan", "Pune", 'O', 30, 'F', 9561450758l);
     HL.PatientInfo("Karva", "Pratibha", "Dastur Nagar", "Amravati", 'B', 58, 'F', 7030085478l);
     HL.PatientInfo("Chancheti", "Vaibhav", "Jamkhed","Pune", 'B', 27, 'F', 8547521526l);
    
     
     HospitalSupp HS = new HospitalSupp();
    	HS.doct("Pravin", 7854122544l, 5, 'M');	
    	HS.doct("Akashy", 780545222l, 7, 'M');
    	
        HospitalSupp.doct1("Anshika", 1234567890l, 5, 'F');
        HospitalSupp.doct1("Charu", 124578585l, 6, 'F');

	}

	public void PatientInfo (String hosptal, String name1, String name2, String city, char group , int age, char gender, long mobno )
	
	{
		System.out.println("*******************************");
		System.out.println("Hospital Name is = " + hosptal);
		System.out.println("Patient Name is = "+ name1);
		System.out.println("Patient Address is = "+ name2 );
		System.out.println("Patient city is =  " + city);
		System.out.println("paitient blood group is = " + group+ "+"); 
		System.out.println("paitient age is = "+ age);
		System.out.println("Paitient gender is "+ gender);
		System.out.println("Paitient mobile no. = "+ mobno);
		System.out.println("*******************************");

		
	}
}

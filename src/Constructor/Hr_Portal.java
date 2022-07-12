package Constructor;

public class Hr_Portal {

	public static void main(String[] args)
	{
      Employee Ashish = new Employee();
      
      Ashish.emp_dept="Prdn";
      Ashish.emp_id= 38224;
      Ashish.emp_name= "Ashish Kamble";
      Ashish.emp_sal= 38552;
      Ashish.gender='M';
      
      Employee Manish = new Employee();
      Manish.emp_dept= "QA";
      Manish.emp_id= 54785;
      Manish.emp_name="Manish Joshi";
      Manish.emp_sal=54786;
      Manish.gender='M';
      
      Employee Sachet = new Employee();
      Sachet.emp_dept= "R&D";
      Sachet.emp_id= 12457;
      Sachet.emp_name=" Sachet Shekh";
      Sachet.emp_sal= 58745;
      Sachet.gender= 'M';
      
      Ashish.emp_info();
      Manish.emp_info();
      Sachet.emp_info();
      
      
      


	}

}

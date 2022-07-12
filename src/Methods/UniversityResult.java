package Methods;

public class UniversityResult {

	public static void main(String[] args)
	{
	UniversityResult ur = new UniversityResult();
    ur.studentInfo("Rahul", 254, 'B', 98.32d);
    ur.studentInfo("Pratik", 411, 'A', 85.58d);
    ur.studentInfo("Siddharth", 147,'A', 98.52d);
    ur.studentInfo("Prachi", 478, 'A', 95.63d);
	}

	public void studentInfo(String studentName,int RollNum, char grade,double totalMarks)
	{
		System.out.println("*******************************");
		System.out.println("Student name is= "+ studentName);
		System.out.println("Student roll number is= "+ RollNum);
		System.out.println("Student grade is= "+ grade);
		System.out.println("Student total marks is= "+ totalMarks);
		System.out.println("*******************************");
		
	}
}

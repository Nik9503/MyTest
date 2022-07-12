package SampleAccess;

import accessSpecifiers.PrivateStudy;

public class Demo extends PrivateStudy
{

	public static void main(String[] args) 
	{
	 PrivateStudy VA = new PrivateStudy();
	 VA.book4();
	 
	 Demo D = new Demo();
	 D.book3();
	 D.book4();
	}

}

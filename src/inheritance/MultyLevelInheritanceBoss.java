package inheritance;

public class MultyLevelInheritanceBoss {

	public static void main(String[] args) 
	{
		Boss B=new Boss();
		B.work();
		
		Emp E = new Emp();
		E.hardworker();
		E.work();
		
		Worker W = new Worker();
		W.timepass();
		W.hardworker();
		W.work();

	}

}

package InterfaceStudy;

public interface Mother 
{
	void receipe();
	void care();
	default void money()
	{
	System.out.println("Mothers Money");
	}
	static void test()
	{
	System.out.println("Mothers test");
	}
}

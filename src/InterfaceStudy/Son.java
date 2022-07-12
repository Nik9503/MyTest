package InterfaceStudy;

public class Son implements Father, Mother {

	public static void main(String[] args)
	{
		Son s = new Son();
		s.care();
		s.receipe();
		s.love();
		s.nature();
		s.money();
		Mother.test();
		Father.test();

	}

	@Override
	public void receipe() {
		System.out.println("Mothers receipe completed in Sons class");
		
	}

	@Override
	public void care() {
		System.out.println("Mothers care completed in Sons class");
		
	}

	@Override
	public void love() {
		System.out.println("Fathers love completed in Sons class");
		
		
	}

	@Override
	public void nature() {
		System.out.println("Fathers nature completed in Sons class");
		
	}

	@Override
	public void money() {
		Father.super.money(); //super keyword is used to resolve calling issue
		Mother.super.money();
	}

}

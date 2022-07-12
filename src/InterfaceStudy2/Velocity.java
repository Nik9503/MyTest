package InterfaceStudy2;

public class Velocity implements Akashy,Vaibhav
{

	public static void main(String[] args) {
		Velocity VY = new Velocity();
		VY.smart();
		VY.talented();
		VY.inteligent();
		VY.goodspaker();
		

	}

	@Override
	public void talented() {
		System.out.println("Telented but not attended Weekly MOCK");
		
	}

	@Override
	public void smart() {

		System.out.println("Smart but not confidence on self");
		
	}

	@Override
	public void inteligent() {
		System.out.println("inteligent but slept early");
		
	}

	@Override
	public void goodspaker() {
		System.out.println("Goodspaker but cant shere KT");
		
	}

}

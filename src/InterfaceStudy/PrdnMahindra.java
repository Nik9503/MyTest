package InterfaceStudy;

public class PrdnMahindra implements MahindraCar	
{
	
	// this class implements sub interface TataLW
	// as TATALWV is sub interface, that its own property and properties form TATA
	// productionTATA has to give definition to all incomplete methods


	public static void main(String[] args) {

		PrdnMahindra PRD = new PrdnMahindra();
		PRD.bus();
		PRD.Truck();
		PRD.JCB();
		PRD.Thar();
		PRD.Scorpio();
		PRD.XUV700();

	}

	@Override
	public void JCB() {
		System.out.println("This is used in construction sector **JCB**");
		
	}

	@Override
	public void Truck() {
		System.out.println("This is used in transportation sectro **Truck**");
		
	}

	@Override
	public void bus() {

		System.out.println("This is used in transportation aslo in public sector **BUS**");
	}

	@Override
	public void XUV700() {
		System.out.println("This is primium model of mahindra **XUV700");
		
	}

	@Override
	public void Thar() {
		System.out.println("This is Offroad car of mahindra ** THAR**");
		
	}

	@Override
	public void Scorpio() {
		System.out.println("This is budget car of mahindra **SCORPIO**");
		
	}

}

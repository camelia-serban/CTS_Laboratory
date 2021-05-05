package ro.ase.cts.simpleFactory;

public class TestSimpleFactory {

	public static void main(String[] args) {
		
		Client client1 = new Client("Mary", StylesFactory.getStyle(StylesType.CUT_CREASE, "cut-crease makeup"));
		client1.setStyle(StylesFactory.getStyle(StylesType.BALAYAGE, "Balayage hairstyle"));
	
		System.out.println(client1.name);
		
	}

}

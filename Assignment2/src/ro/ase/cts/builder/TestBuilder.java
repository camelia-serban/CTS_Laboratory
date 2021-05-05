package ro.ase.cts.builder;

import ro.ase.cts.builder.Client.ClientBuilder;

public class TestBuilder {

	public static void main(String[] args) {
		
		Client client1 = new Client.ClientBuilder("Camelia", 15).addDesiredMakeup(new Cut_Crease()).build();
		
		System.out.println(client1.isNew);
		
		ClientsDirector c1 = new ClientsDirector(new ClientBuilder("Mary", 9));
		Client c2 = c1.buildMary();
		System.out.println(c2.isNew);
	}
	

}

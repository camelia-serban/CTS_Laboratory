package ro.ase.cts.builder;

public class ClientsDirector {

	Client.ClientBuilder builder;
	
	public ClientsDirector(Client.ClientBuilder builder) {
		this.builder = builder;
	}
	
	public Client buildMary() {
		return builder.isNewClient().addDesiredMakeup(new Cut_Crease()).build();
	}
	
}

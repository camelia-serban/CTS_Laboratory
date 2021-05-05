package ro.ase.cts.builder;

public class Client {

	String name;
	int beautyPoints;
	boolean isNew;
	
	MakeupInterface desiredMakeup;
	
	private Client() {
		
	}

	private Client(String name, boolean isNew, MakeupInterface desiredMakeup) {
		super();
		this.name = name;
		this.isNew = isNew;
		this.desiredMakeup = desiredMakeup;
	}
	
	public void comesFirstTime(int points) {
		this.name = name;
		this.beautyPoints = points;
		if(this.beautyPoints < 10) {
			this.isNew = true;
		}
	}
	
	public static class ClientBuilder {
		
		public Client client = null;
		
		public ClientBuilder(String name, int beautyPoints) {
			client = new Client();
			client.name = name;
			client.beautyPoints = beautyPoints;
		}
		
		public ClientBuilder isNewClient() {
			client.isNew = true;
			return this;
		}
		
		public ClientBuilder addDesiredMakeup(MakeupInterface makeup) {
			client.desiredMakeup = makeup;
			return this;
		}
		
		public Client build() {
			return this.client;
		}
	}
}

package ro.ase.csie.cts.dp.facade;

public class GameServer {

	public void connect(String serverIP) {
		System.out.println("Connecting to " + serverIP);
	}
	
	public boolean isConnected() {
		return true;
	}
}

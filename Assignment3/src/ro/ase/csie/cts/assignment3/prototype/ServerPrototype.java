package ro.ase.csie.cts.assignment3.prototype;

import ro.ase.csie.cts.assignment3.ServerInterface;


public class ServerPrototype implements ServerInterface, Cloneable {
	
    private static ServerPrototype server = null;
	
	protected String IpAddress;
	protected int port;
	protected int MaxConnections;
	private boolean connect;
	private boolean disconnect;
	
	@Override
	public String getIpAddress() {
		return this.IpAddress;
	}

	@Override
	public int getPort() {
		return this.port;
	}

	@Override
	public int getMaxConnections() {
		return this.MaxConnections;
	}

	@Override
	public boolean connect() {
		return this.connect = true;
	}

	@Override
	public boolean disconnect() {
		return this.disconnect = true;
	}
	
	public ServerPrototype(String ipAddress, int port, int connections, boolean connected, boolean disconnected) {
		this.IpAddress = ipAddress;
		this.port = port;
		this.MaxConnections = connections;
		this.connect = connected;
		this.disconnect = disconnected;
	}
	
	private ServerPrototype() {
		
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		ServerPrototype copy = new ServerPrototype();
		copy.IpAddress = this.IpAddress;
		copy.port = this.port;
		copy.MaxConnections = this.MaxConnections;
		copy.connect = this.connect;
		copy.disconnect = this.disconnect;
		return copy;
	}	

}

package ro.ase.csie.cts.assignment3.singleton;

import ro.ase.csie.cts.assignment3.ServerInterface;

public class ServerSingleton implements ServerInterface{

	private static ServerSingleton server = null;
	
	protected String IpAddress;
	protected int port;
	protected int connections;
	private boolean connect;
	private boolean disconnect;
	
	public static final int MAX_CONNECTIONS = 2;
	
	private ServerSingleton(String ipAddress, int connections, int port, boolean connect, boolean disconnect) {
	    super();
		this.IpAddress = ipAddress;
		this.connections = connections;
		this.port = port;
		this.connect = connect;
		this.disconnect = disconnect;
	}
	
	@Override
	public String getIpAddress() {
		return this.IpAddress;
	}

	@Override
	public int getPort() {
		return port;
	}

	@Override
	public int getMaxConnections() {
		return connections;
	}

	@Override
	public boolean connect() {
		connect = true;
		return connect;
	}

	@Override
	public boolean disconnect() {
		disconnect = true;
		return disconnect;
	}
	
	public static ServerSingleton getServer(String ipAddress, int port, int connection, boolean connected, boolean disconnected) {
		if(server == null){
			server = new ServerSingleton(ipAddress, port, connection, connected, disconnected);
		}
		return server;
	}

}

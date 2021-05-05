package ro.ase.cts.singleton;

import java.util.Hashtable;

public class DbConnectionRegistry {

	String connectionData;
	String schema;	
	
	private static Hashtable<String, DbConnectionRegistry> connections = new Hashtable<>();	
	
	private DbConnectionRegistry() {
		System.out.println("Creating a connection object");
		System.out.println("Loading configuration...");
		this.connectionData = "127.0.1";
		this.schema = "beautySalon";
	}

	private DbConnectionRegistry(String connData, String schema) {
		super();
		this.connectionData = connData;
		this.schema = schema;
	}
	
	public static DbConnectionRegistry getDbConnection(String connData, String schema) {
		DbConnectionRegistry connection = connections.get(connData);
		if(connection == null) {
			connection = new DbConnectionRegistry(connData, schema);
			connections.put(connData, connection);
		}
		return connection;
	}
	
}

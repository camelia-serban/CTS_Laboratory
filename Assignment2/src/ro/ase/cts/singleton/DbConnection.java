package ro.ase.cts.singleton;

public class DbConnection {
	
	String connectionData;
	String schema;
	
	private static DbConnection connection = null;	
	
	private DbConnection() {
		System.out.println("Creating a connection object");
		System.out.println("Loading configuration...");
		this.connectionData = "127.0.1";
		this.schema = "beautySalon";
	}

	private DbConnection(String connData, String schema) {
		super();
		this.connectionData = connData;
		this.schema = schema;
	}
	
	public static DbConnection getConnection() {
		if(DbConnection.connection == null) {
			connection = new DbConnection();
		}
		return DbConnection.connection;
	}
	
}

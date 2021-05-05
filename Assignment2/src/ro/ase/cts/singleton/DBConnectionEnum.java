package ro.ase.cts.singleton;

public enum DBConnectionEnum {
	
	D1_DB, D2_DB;
	
	String connectionData;
	String schema;
	
	private DBConnectionEnum() {
		System.out.println("Loading settings from the configuration file");
	}
	
}

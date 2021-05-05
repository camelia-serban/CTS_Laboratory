package ro.ase.cts.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		
		DbConnectionRegistry con1 = DbConnectionRegistry.getDbConnection("120.0.0.1", "D1_DB");
		DbConnectionRegistry con2 = DbConnectionRegistry.getDbConnection("121.0.0.1", "D2_DB");
				
		if(con1 == con2) {
			System.out.println("They are pointing to the same database");
		}
		else 
		{
			System.out.println("They are different");
		}
		
		DbConnection conn1 = DbConnection.getConnection();
		DbConnection conn2 = DbConnection.getConnection();
				
		if(conn1 == conn2) {
			System.out.println("They are pointing to the same database");
		}
		else 
		{
			System.out.println("They are different");
		}
	
	}	

}

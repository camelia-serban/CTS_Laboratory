package ro.ase.csie.cts.singleton.staticref;

public class TestSingleton {

	public static void main(String[] args) {
		
		DbConnection con1 = DbConnection.connection;
		DbConnection con2 = DbConnection.connection;
		
		if(con1 == con2) {
			System.out.println("They are the same");
		}

	}

}

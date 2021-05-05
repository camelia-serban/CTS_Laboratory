package ro.ase.cts.prototype;

public class TestPrototype {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		BalayageModel balayageClient1 = new BalayageModel("blonde", 20);
		BalayageModel balayageClient2 = balayageClient1;
		
		System.out.println(balayageClient2.color);
		
		BalayageModel balayageClient3 = (BalayageModel) balayageClient1.clone();
		
		System.out.println(balayageClient3.color);
	}

}

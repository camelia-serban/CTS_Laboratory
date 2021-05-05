package ro.ase.cts.prototype;

import java.util.ArrayList;
import java.util.Random;

public class BalayageModel implements Cloneable{

	String color;
	int hairLenght;
	
	ArrayList<Integer> processes = new ArrayList<>();
	
	public BalayageModel(String color, int length) {
		this.color = color;
		this.hairLenght = length;
		
		System.out.println("Balayage starting process ...");
		try {
			Thread.sleep(2000);
			Random random = new Random(1000);
			for(int i = 0; i < 5; i++) {
				this.processes.add(random.nextInt(20));
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Balayage processes loaded");
	}
	
	private BalayageModel() {
		
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		BalayageModel copy = new BalayageModel();
		copy.color = this.color;
		copy.hairLenght = this.hairLenght;
		copy.processes = (ArrayList<Integer>)this.processes.clone();
		return copy;
	}
	
	
}

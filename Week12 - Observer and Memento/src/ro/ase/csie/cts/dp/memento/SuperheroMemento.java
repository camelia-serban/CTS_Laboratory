package ro.ase.csie.cts.dp.memento;

import java.util.Date;

public class SuperheroMemento {

	String name;
	private int lifePoints;
	String magic;
	
	Date timestamp;
		
	public SuperheroMemento(String name, int lifePoints, String magic) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
		this.magic = magic;
		this.timestamp = timestamp;
	}
	
	public String getName() {
		return name;
	}
	public int getLifePoints() {
		return lifePoints;
	}
	public String getMagic() {
		return magic;
	}	
	
}

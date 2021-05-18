package ro.ase.csie.cts.dp.memento;

public class Superhero {

	String name;
	private int lifePoints;
	String magic;
	
	public Superhero(String name, int lifePoints, String magic) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
		this.magic = magic;
	}
	
	public void attack() {
		System.out.println("Is attacking...");
	}
	
	public void heal() {
		System.out.println("Is healing...");
	}
	
	public void move() {
		System.out.println("Is moving...");
	}
	
	//memento is just the state of the superhero, not the superhero
	
	public SuperheroMemento save() {
		return new SuperheroMemento(name, lifePoints, magic);
	}
	
	public void load(SuperheroMemento memento) {
		this.name = memento.getName();
		this.lifePoints = memento.getLifePoints();
		this.magic = memento.getMagic();
	}
}

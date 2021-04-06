package ro.ase.csie.cts.dp.simpleFactory;

public class SuperHero {

	String name;
	AbstractWeapon weapon;
	
	public SuperHero(String name, AbstractWeapon weapon) {
		super();
		this.name = name;
		this.weapon = weapon;
	}

	public void setWeapon(AbstractWeapon weapon) {
		this.weapon = weapon;
	}
		
}

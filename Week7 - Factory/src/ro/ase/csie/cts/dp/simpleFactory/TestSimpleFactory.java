package ro.ase.csie.cts.dp.simpleFactory;

public class TestSimpleFactory {

	public static void main(String[] args) {
		
		/*
		SuperHero superman = new SuperHero("superman", new Pistol("Pistol",100));
		superman.setWeapon(new MachineGun(500, 1000));
		superman.setWeapon(new Bazooka());
		*/
		
		SuperHero batman = new SuperHero("Batman", WeaponsFactory.getWeapon(WeaponType.PISTOL, "Pistol"));
		batman.setWeapon(WeaponsFactory.getWeapon(WeaponType.MACHINE_GUN, "MG"));
		batman.setWeapon(WeaponsFactory.getWeapon(WeaponType.BAZOOKA, "Boom"));
		
	}

}

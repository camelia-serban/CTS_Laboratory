package ro.ase.csie.cts.dp.factoryMethod;

import ro.ase.csie.cts.dp.simpleFactory.SuperHero;
import ro.ase.csie.cts.dp.simpleFactory.WeaponType;
import ro.ase.csie.cts.dp.simpleFactory.WeaponsFactory;

public class TestFactory {

	public static void main(String[] args) {
		
		boolean kidsMode = true;
		SuperHero superman = null;
		
		if(kidsMode) {
			superman = new SuperHero("Superman", new WaterPistol());		
		}
		else {
			superman = new SuperHero("Superman", WeaponsFactory.getWeapon(WeaponType.PISTOL, ""));
		}
		
		//with factory method
		AbstractFactory weaponFactory = (kidsMode == true) ? new WaterWeaponsFactory() : new RealWeaponsFactory();
		
		superman = new SuperHero("Superman", weaponFactory.getWeapon(WeaponType.PISTOL, ""));
		superman.setWeapon(weaponFactory.getWeapon(WeaponType.BAZOOKA, ""));
		
	}

}

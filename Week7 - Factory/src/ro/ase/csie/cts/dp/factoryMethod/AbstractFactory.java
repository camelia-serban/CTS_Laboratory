package ro.ase.csie.cts.dp.factoryMethod;

import ro.ase.csie.cts.dp.simpleFactory.AbstractWeapon;
import ro.ase.csie.cts.dp.simpleFactory.WeaponType;

public abstract class AbstractFactory {

	public abstract AbstractWeapon getWeapon(WeaponType type, String description);
	
}

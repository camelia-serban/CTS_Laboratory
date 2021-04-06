package ro.ase.csie.cts.dp.factoryMethod;

import ro.ase.csie.cts.dp.simpleFactory.AbstractWeapon;
import ro.ase.csie.cts.dp.simpleFactory.Bazooka;
import ro.ase.csie.cts.dp.simpleFactory.MachineGun;
import ro.ase.csie.cts.dp.simpleFactory.Pistol;
import ro.ase.csie.cts.dp.simpleFactory.WeaponType;

public class RealWeaponsFactory extends AbstractFactory{

	@Override
	public AbstractWeapon getWeapon(WeaponType type, String description) {

		AbstractWeapon weapon = null;
		
		switch(type) {
		case PISTOL:
			weapon = new Pistol(description, 100);
			break;
		case MACHINE_GUN:
			weapon = new MachineGun(500, 1000);
			break;
		case BAZOOKA:
			weapon = new Bazooka();
			break;
		default:
			throw new UnsupportedOperationException("Type no covered");			
		}
		
		return weapon;
	}

}

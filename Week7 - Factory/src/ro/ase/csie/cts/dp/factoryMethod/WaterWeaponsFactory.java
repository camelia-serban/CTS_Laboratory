package ro.ase.csie.cts.dp.factoryMethod;

import ro.ase.csie.cts.dp.simpleFactory.AbstractWeapon;
import ro.ase.csie.cts.dp.simpleFactory.WeaponType;

public class WaterWeaponsFactory extends AbstractFactory{

	@Override
	public AbstractWeapon getWeapon(WeaponType type, String description) {
		
		AbstractWeapon weapon = null;
		switch(type) {
		case PISTOL:
			weapon = new WaterPistol();
			break;
		case MACHINE_GUN:
			weapon = new WaterBalloon();
			break;
		case BAZOOKA:
			weapon = new WaterBucket();
			break;
		default:
			throw new UnsupportedOperationException();
		}
		return weapon;
	}

}

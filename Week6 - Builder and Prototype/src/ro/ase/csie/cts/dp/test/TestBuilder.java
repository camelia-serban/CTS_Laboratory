package ro.ase.csie.cts.dp.test;

import ro.ase.csie.cts.dp.builder.Pistol;
import ro.ase.csie.cts.dp.builder.SuperHero;
import ro.ase.csie.cts.dp.builder.SuperHero.SuperHeroBuilder;
import ro.ase.csie.cts.dp.builder.SuperHeroesDirector;

public class TestBuilder {

	public static void main(String[] args) {
		
//		//1. create the object
//		SuperHero superHero = new SuperHero();
//		//2. init the object
//		//TO DO: don't forget
//		superHero.name = "Superman";
//		superHero.lifePoints = 100;
//		superHero.superPower = "Can fly";
//		superHero.superPower = "Laser eyes";
		
		/*  SuperHero superHero = new SuperHero(
		 *     "Superman", 
		 *      100, 
		 *      false, 
		 *      false,
		 *      null,
		 *      new Pistol(), 
		 *      "Laser eyes", 
		 *      "");
		*/
		
		SuperHero superman = new SuperHero.SuperHeroBuilder("Superman", 100)
				.addSuperPower("Fly")
				.addLeftWeapon(new Pistol())
				.build();
		
		SuperHero joker = new SuperHero.SuperHeroBuilder("Joker", 200)
				.isVillain()
				.addLeftWeapon(new Pistol())
				.addRightWeapon(new Pistol())
				.build();
		
		SuperHeroesDirector catalogue = new SuperHeroesDirector(new SuperHeroBuilder("Joker", 200));
		SuperHero jokerClone = catalogue.buildJoker();
		
		
	}

}

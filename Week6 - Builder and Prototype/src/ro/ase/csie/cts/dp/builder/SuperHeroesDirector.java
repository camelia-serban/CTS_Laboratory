package ro.ase.csie.cts.dp.builder;

public class SuperHeroesDirector {

	SuperHero.SuperHeroBuilder builder;
	
	public SuperHeroesDirector(SuperHero.SuperHeroBuilder builder) {
		this.builder = builder;
	}
	
	public SuperHero buildJoker() {
		return builder.isVillain()
				.addLeftWeapon(new Pistol())
				.addRightWeapon(new Pistol())
				.build();
	}
	
	public SuperHero builderSuperman() {
		return builder.addSuperPower("Fly")
				.addLeftWeapon(new Pistol())
				.build();
	}
}

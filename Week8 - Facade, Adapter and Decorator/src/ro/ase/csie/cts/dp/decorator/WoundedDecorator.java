package ro.ase.csie.cts.dp.decorator;

import ro.ase.csie.cts.dp.adapter.ACMESuperHero;

public class WoundedDecorator extends AbstractDecorator{

	public WoundedDecorator(ACMESuperHero hero) {
		super(hero);
	}

	@Override
	public void move() {
		if(this.hero.lifePoints > 500)
			super.move();
		else {
			System.out.println("The hero is barely moving");
		}
		
	}	

}

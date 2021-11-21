package fr.uge.fight;

import java.util.Random;

public class Fighter extends Robot {

	private Random randomhit ;

	public Fighter(String name, int seed) {
		super(name);
		randomhit = new Random(seed);
	}

	@Override
	public boolean rolldice() {
		return randomhit.nextBoolean();
	}
	
	@Override
	public boolean fire(Robot robot) {
		if(robot.isDead()) {
			throw new AssertionError("Interdiction de tirer sur un mort");
		}
		if(rolldice()) {
			robot.hit();
			return true;
		}
		return false;
	}
	
	
	@Override
	public String toString() {
		return "Fighter " + name();
	}
	
}

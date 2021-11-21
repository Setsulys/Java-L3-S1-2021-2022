package fr.uge.fight;

import java.util.Objects;

public class Robot {

	private final String name;
	private int pv;
	
	public Robot(String name) {
		Objects.requireNonNull(name);
		this.name = name;
		this.pv = 10;
	}

	@Override
	public String toString() {
		return "Robot " + name;
	}
	
	public boolean rolldice() {
		return true;
	}
	
	
	public void hit() {
		this.pv-=2;
	}
	
	
	public String name() {
		return name;
	}
	
	public boolean fire(Robot robot) {
		if(robot.isDead()) {
			throw new AssertionError("Interdiction de tirer sur un mort");
		}
		if(!rolldice()) {
			return false;
		}
		robot.pv-=2;
		return true;
	}
	
	public boolean isDead() {
		if(this.pv <= 0) {
			return true;
		}
		return false;
	}
}

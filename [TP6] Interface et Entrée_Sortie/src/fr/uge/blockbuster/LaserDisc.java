package fr.uge.blockbuster;

import java.util.Objects;

public record LaserDisc(String name) implements Article {
	
	public LaserDisc{
		Objects.requireNonNull(name);
	}
	
	
	@Override 
	public String toString() {
		return "LaserDisc : " + name;
	}
	@Override
	public String toText() {
		return "LaserDisc : " + name;
	}
}

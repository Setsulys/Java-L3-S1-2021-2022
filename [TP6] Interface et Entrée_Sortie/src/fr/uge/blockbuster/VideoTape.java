package fr.uge.blockbuster;
import java.time.Duration;
import java.util.Objects;

public record VideoTape(String name, Duration duration) implements Article {
	
	public VideoTape(String name, Duration duration) {
		Objects.requireNonNull(name,"name is null");
		if(duration.isNegative() || duration.isZero()) {
			throw new IllegalStateException("Duration not");
		}
		this.name = name;
		this.duration = duration;
	}
	
	@Override
	public String toString() {
		return "VideoTape : " + name + " : " + duration.toMinutes() ;
	}
	
	@Override
	public String toText() {
		return "VideoTape : " + name + " : " + duration.toMinutes();
	}
}


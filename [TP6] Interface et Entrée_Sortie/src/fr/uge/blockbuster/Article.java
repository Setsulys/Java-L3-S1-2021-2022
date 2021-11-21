package fr.uge.blockbuster;
import java.time.Duration;

public interface Article {
	
	String name();
	String toText();
	
	public static Article fromText(String article) {
		var entry = article.split(" : ");
		switch(entry[0]) {
		case "VideoTape":
			return new VideoTape(entry[1], Duration.ofMinutes(Long.parseLong(entry[2])));
		case "LaserDisc":
			return new LaserDisc(entry[1]);
		}
		return null;
	}
}

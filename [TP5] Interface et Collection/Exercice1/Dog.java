import java.util.Objects;

public record Dog(String name, int weight) /*implements Shelter*/ {
	
	public Dog(String name, int weight) {
		Objects.requireNonNull(name,"name is null");
		if(weight < 0) {
			throw new IllegalArgumentException("weight < 0");
		}
		this.name = name;
		this.weight = weight;
	}
}

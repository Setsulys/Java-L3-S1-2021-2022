import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

public class Shelter {
	
	private final List<Dog> animals;
	
	public Shelter() {
		animals = new ArrayList<Dog>();
	}
	
	public void add (Dog dog) {
		Objects.requireNonNull(dog);
		animals.add(dog);
	}
	public Shelter removeAll(String name) {
		var removed = new Shelter();
		for(var elts : animals) {
			if(elts.name().equals(name)) {
				removed.add(elts);
			}
		}
		animals.removeIf(element ->(element.name().equals(name)));
		return removed;
	}
	
	public double biscuit() {
		double nbbiscuit = 0;
		for(var element : animals) {
			nbbiscuit = nbbiscuit + (element.weight()*7.3);
		}
		return nbbiscuit;
	}
	
	@Override
	public String toString() {
		var builder = new StringBuilder();
		for(var element : animals) {
			var name = element.name();
			var weight = element.weight();
			builder.append(name).append(" , weight :").append(weight).append(" kg\n");
			
		}
		return builder.toString();
	}
}

import java.util.Objects;

public record Cat(String name, double biscuit) implements Pet{
	
	public Cat(String name,double biscuit) {
		Objects.requireNonNull(name,"title is null");
		if(biscuit < 0) {
			throw new IllegalArgumentException("biscuit < 0");
		}
		this.name = name;
		this.biscuit = biscuit;
	}
	
	@Override
	public String toString() {
		return name +", " + biscuit +" biscuits";
	}

	@Override
	public void shelter(Shelter shelter) {
	}
	
}

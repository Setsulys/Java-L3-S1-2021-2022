import java.util.Objects;

public class Dog implements Pet {

	private Shelter shelter;
	private final String name;
	private final int weight;
	
	
	public Dog(String name,int weight) {
		Objects.requireNonNull(name,"name is null");
		if(weight < 0) {
			throw new IllegalArgumentException("weight < 0");
		}
		this.name = name;
		this.weight = weight;
	}

	@Override
	public String name() {
		return name;
	}
	
	@Override
	public double biscuit() {
		return weight * 7.3;
	}
	
	@Override
	public String toString() {
		if(this.equals(shelter.king)) {
			return name + ", "+ weight +" Kg  [KING]";
		}
		return name +", " + weight +" Kg";
	}

	@Override
	public void shelter(Shelter shelter) {
		Objects.requireNonNull(shelter);
		if(this.shelter != null ) {
			throw new IllegalStateException("Dog Already in another Shelter");
		}
		this.shelter = shelter ;
	}
	
	public void isNowKing() {
		shelter.king = this;
	}

}

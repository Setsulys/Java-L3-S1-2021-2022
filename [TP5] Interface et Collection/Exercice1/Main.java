
public class Main {
	
	public static void main(String[] args) {
		var shelter = new Shelter();
		var removedDogs = new Shelter();
		shelter.add(new Dog("Scooby doo", 21));
		shelter.add(new Dog("Scooby doo", 22));
		shelter.add(new Dog("Cookie", 11));
		shelter.add(new Dog("Jupiter", 21));
		shelter.add(new Dog("Idefix",2));

		System.out.println("\nShelter____");
		System.out.println(shelter);
		removedDogs = shelter.removeAll("Scooby doo");
		System.out.println("Remove Scooby doo");
		System.out.println(removedDogs);
		System.out.println("\nShelter____");
		System.out.println(shelter);
		System.out.println("biscuits____ \n" + shelter.biscuit());
	}
}

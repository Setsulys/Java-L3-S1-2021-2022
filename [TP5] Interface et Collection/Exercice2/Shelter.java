import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

import java.util.Map;
import java.util.LinkedHashMap;

public class Shelter {
	/*
	private final List<Pet> animals;
	Dog king;
	
	public Shelter() {
		animals = new ArrayList<Pet>();
	}
	
	public void add (Pet pet) {
		Objects.requireNonNull(pet);
		animals.add(pet);
		pet.shelter(this);
	}
	public List<Pet> removeAll(String name) {
		var removed = new ArrayList<Pet>();
		for(var elts : animals) {
			if(elts.name().equals(name)) {
				removed.add(elts);
				
			}
		}
		animals.removeIf(element ->(element.name().equals(name)));
		return removed;
	}
	
	public String biscuit() {
		var builder = new StringBuilder();
		double biscuittotal = 0;
		for(var element : animals) {
			biscuittotal += element.biscuit();
		}
		builder.append("\nBiscuit total : ").append(biscuittotal);
		return builder.toString();
	}
	
	@Override
	public String toString() {
		var builder = new StringBuilder();
		for(var element : animals) {
			builder.append(element).append("\n");
		}
		return builder.toString();
	}
	*/
	
	
	//Exercice 2 question 5
	private final Map<String,Pet> animals;
	Dog king;
	
	public Shelter() {
		animals = new LinkedHashMap<String,Pet>();
	}
	
	public void add (Pet pet) {
		Objects.requireNonNull(pet);
		for(var elt : animals.entrySet()) {
			if(pet.name().equals(elt.getKey())){
				throw new IllegalArgumentException("There is Already an animal with this name in the Shelter");
			}
		}
		animals.put(pet.name(),pet);
		pet.shelter(this);
	}
	public LinkedHashMap<String,Pet> removeAll(String name) {
		var removed = new LinkedHashMap<String,Pet>();
		for(var elts : animals.entrySet()) {
			if(elts.getKey().equals(name)) {
				removed.put(elts.getKey(),elts.getValue());
				
			}
		}
		animals.entrySet().removeIf(element ->(element.getKey().equals(name)));
		return removed;
	}
	
	public String biscuit() {
		var builder = new StringBuilder();
		double biscuittotal = 0;
		for(var element : animals.entrySet()) {
			biscuittotal += element.getValue().biscuit();
		}
		builder.append("\nBiscuit total : ").append(biscuittotal);
		return builder.toString();
	}
	
	@Override
	public String toString() {
		var builder = new StringBuilder();
		for(var element : animals.entrySet()) {
			builder.append(element.getValue()).append("\n");
		}
		return builder.toString();
	}

}

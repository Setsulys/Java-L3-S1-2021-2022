
public class Main {
	
	public static void main(String[] args) {
		var shelter = new Shelter();
		var shelter2 = new Shelter();
		
		var max = new Dog("Max",18);
		var beethoven = new Dog("Beethoven",30);
		var pocchi = new Dog("Pocchi ",7);
		var tama = new Cat("Tama",18);
		
		
		shelter.add(new Dog("Idefix",2));
		shelter.add(new Cat("Felix",15));
		shelter.add(new Cat("Garfield",5));
		shelter.add(pocchi);
		
		shelter2.add(beethoven);
		shelter2.add(new Dog("Idefix",2));
		
		
		shelter.add(new Dog("Scooby doo", 21));
		//shelter.add(new Dog("Scooby doo", 22));	//verification qu'il ne puisse pas avoir 2 animaux du meme nom dans le meme shelter
		shelter.add(new Cat("Nyan",10));
		//shelter.add(new Cat("Nyan",11));	//verification qu'il ne puisse pas avoir 2 animaux du meme nom dans le meme shelter
		//shelter.add(max);  //verification que un chien ne puisse pas etre dans 2 shelter a la foi
		shelter2.add(max);
		shelter.add(tama);	//verification qu'un chat soit dans  2 shelter
		shelter2.add(tama);	//verification qu'un chat soit dans  2 shelter
		
		
		pocchi.isNowKing();
		beethoven.isNowKing();
		
		System.out.println("Shelter\n____");
		System.out.println(shelter);
		System.out.println("Shelter2\n____");
		System.out.println(shelter2);
		
		System.out.println("biscuits\n_____" + shelter.biscuit());
		
		var removedAnimals = shelter.removeAll("Scooby doo");
		System.out.println("\n\nRemoved Animals ____");
		System.out.println(removedAnimals);
		
		max.isNowKing(); //test de changement de roi
		
		System.out.println("\nShelter\n____");
		System.out.println(shelter);
		System.out.println("Shelter2\n____");
		System.out.println(shelter2);
		
		System.out.println("\n\nbiscuits Shelter\n_____" + shelter.biscuit());
		System.out.println("\n\nbiscuits Shelter2\n_____" + shelter2.biscuit());
		
	}
}


//Exercice 2
//2 Expliquer comment faire, en Java, pour ne pouvoir avoir que des chats et des chiens dans le refuge. 
/*Pour ne permetre d'avoir que des chiens et chats dans le refuge 
 * il faut utiliser une interface scellee
 * c'est a dire que l'on connait tout les sous type de l'interface 
 * Ici présent si on voulait appliquer ceci nous devrions faire
 * un public sealed interface Pet permits Dogs, Cat{}
 */

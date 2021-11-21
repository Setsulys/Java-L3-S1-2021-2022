//LY-IENG Steven

//Exercice 2 En morse Stop
//1
/*
public class Morse {

	public static void main(String[] args){
		for(var array : args)
			System.out.print(array+" Stop. ");
		System.out.println("\n");
	}
	
}
*/

//2 A quoi sert l'objet java.lang.StringBuilder ?
/*
L'objet java.lang.StringBuilder permet d'eviter d'avoir 
trop d'allocations de String intermediaires
*/

//3 Réécrire la classe Morse en utilisant un StringBuilder.

public class Morse {

	public static void main(String[] args){
		var builder = new StringBuilder();
		for(var array : args){
			builder.append(array).append(" Stop. ");
		}
		System.out.println(builder);
	}

}
/*
Par rapport a la solution précédente il est plus efficace d'utiliser un stringbuilder 
dans une boucle que un ' + '
*/

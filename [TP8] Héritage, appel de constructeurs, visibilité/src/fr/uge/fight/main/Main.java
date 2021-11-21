package fr.uge.fight.main;


import fr.uge.fight.*;

public class Main {
	
	
	public static void main(String[] args) {
		var bob = new Robot("Bob");
		System.out.println(bob);//Robot bob
		
		var d2r2 = new Robot("D2R2");
		System.out.println(d2r2);//Robot d2r2
		var data = new Robot("Data");
		System.out.println(data);
		System.out.println(Arena.fight(d2r2,data) + " wins\n"); //d2r2     //car d2r2 gagnera toujours
		
		
		var homer  = new Fighter("John",1);
		var bart = new Fighter("Jane",3);
		System.out.println(Arena.fight(homer,bart) + " wins\n");
	}
}

/*Exercice 2*/
//1 Pourquoi on ne peut pas utiliser un record Robot pour modeliser un robot?
/*
 * On ne peut pas utiliser un record pour modeliser un robot car on devra modifier ses champs, ils ne seront
 * pas tous des champs finaux
 */


/*Exercice 3*/
//1 Expliquer comment marche un générateur pseudo aléatoire et qu'est que la graine d'un generateur 
//pseudo aleatoire
/*
 *  Un generateur pseudo aleatoire marche a l'aide d'une graine qui change avec le temps
*/

//3 Expliquer pourquoi il ne faut jamais qu'un champ soit déclaré avec une visibilité autre que private'
//(ou eventuellement, de package)
/*
 *Si on ne met pas en private les champs de ma classe on pourra modifier les champs dans d'autres classes
 */



//En conclusion, rappeler ce qu'est le sous-typage et ce qu'est le polymorphisme
//en utilisant comme exemple les codes que vous venez d'ecrire
/*
 * Un sous-typage permet d'utiliser une sous classe  a tout les endroits ou on le demande
 * 
 * Le polymorphisme c'est lorsque l'on veut afficher un objet et on demande a l'objet de s'afficher
 * on utilise la notation "dot" pour que l'objet selectionne le code a executer.
 * dans la Class Fighter on utilise la methode hit qui est dans la classe robot on appel alors
 * la methode hit avec un polymorphisme. 
 * 
 */


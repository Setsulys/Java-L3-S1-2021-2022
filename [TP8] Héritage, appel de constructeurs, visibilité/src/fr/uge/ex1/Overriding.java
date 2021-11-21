package fr.uge.ex1;

public class Overriding {
	public static void main(String[] args) {
	     A.printX(new A());     // 1
	     B.printX(new B());   // 2
	     A.printX(new B());   // 3
	     A a = new B();
	     a.m(a);              // 4
	   }
}
//Expliquer, pour chacun des quatre appels numérotés //1, //2, //3 et //4, 
//ce qui devrait être affiché, simplement à la lecture du code. Puis, pour 
//chaque appel, exécuter le code pour confirmer (ou infirmer) votre intuition.

/*Exercice 1*/
/*
 * 1) 	in A.printX x  1 \n getX() 1
 * 2)	in B.printX x  2 \n getX() 2
 * 3)	in B.printX x  1 \n getX() 2
 *
 * Apres execution du programme je peux affirmer que j'ai eu une bonne intuition
 */

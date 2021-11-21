//LY (LY-IENG) Steven 
//Exercice 3 Calculette simple

/*--------1--------*/
/*
import java.util.Scanner; 

public class Calc { 
	public static void main(String[] args) {
		Scanner scanner;//Variable de type Scanner
		scanner = new Scanner(System.in);
		int value;//Variable de type Int
		value = scanner.nextInt();
		System.out.println(value);
	}
}
*/


/*--------2--------*/
/*
import java.util.Scanner; 

public class Calc { 
	public static void main(String[] args) {
		Scanner scanner; int value;
		scanner = new Scanner(System.in);
		
		value = scanner.nextInt();
		System.out.println(value);
	}
}
*/

/*--------3--------*/
// nextIn() n'est pas une fonction mais une Méthode


/*--------4--------*/
//La ligne import java.util.Scanner; nous permet de specifier la classe que l'on veut utiliser du package


/*--------5--------*/
/*
import java.util.Scanner; 

public class Calc { 
	public static void main(String[] args) {
		Scanner scanner; int value,value2;
		scanner = new Scanner(System.in);
		
		value = scanner.nextInt();
		value2 = scanner.nextInt(); 
		System.out.println(value+value2);
	}
}
*/

/*--------6--------*/

import java.util.Scanner; 

public class Calc { 
	public static void main(String[] args) {
		Scanner scanner; int value,value2;
		scanner = new Scanner(System.in);
		
		value = scanner.nextInt();
		value2 = scanner.nextInt();
		System.out.println("Somme"); 
		System.out.println(value+value2);
		System.out.println("Difference");
		System.out.println(value-value2);
		System.out.println("Produit");
		System.out.println(value*value2);
		System.out.println("Quotient , reste");
		System.out.println(value/value2+","+value%value2);
	}
}

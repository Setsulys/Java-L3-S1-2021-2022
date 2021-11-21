//LY (LY-IENG) Steven 
//Exercice 2 Afficher les arguments de la ligne de commande

/*--------1--------*/
/*
public class PrintArgs{
	public static void main(String[] args){
		System.out.println(args[0]);
	}
}
*/
//Si on ne passe pas d'argument lors de l'execution du programme rien n'est affiché


/*--------2--------*/
/*
public class PrintArgs{
	public static void main(String[] args){
		for(var i=0 ; i < args.length ; i++){
			System.out.println(args[i]);
		}
	}
}
*/
/*--------3--------*/

public class PrintArgs{
	public static void main(String[] args){
		for(String	array : args){
			System.out.println(array);
		}
	}
}

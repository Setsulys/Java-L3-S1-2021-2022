//LY-IENG Steven
//Exercice 1
public class Main {
	public static int foo;
	public static int getFoo() {
		return foo;
	}
	public static void setFoo(int foo) {
		Main.foo = foo;
	}
	public static void main(String args[ ]){
		String s;
		System.out.println("Hello Eclipse");
		int a = new Integer(2);
	}
 @Override
	public String toString() {
	 //TODO Auto-generated method stub
		return super.toString();
	}
 
}

//7
/*
 * 1/ sysout + Ctrl + Space dans le main cree un System.out.println();
 * 2/ toStr + Ctrl + Space nous permet de redefinir la methode to String
 * 3/get + Ctrl + Space cree une methode qui retourne foo et set +Ctrl + Space initialise foo
 * 4/En allant dans source lorsque l'on veut creer un constructeur initialisant le champ foo il faut que l'on selectionne foo
 * 5/ Press enter to refactor option
 * 6/ On extrait la variable et on en cree une nouvelle qui aura pour valeur 2 + 3  
 * 	on additionnera ensuite la variable a 4
 * 7/ On extrait la variable locale pour la remplacer
 * 8/Lorsque l'on fait cette operation on peut avoir la documentation du type String 
 * 9/ Ctrl + clic sur super.toString() nous permet de voir la javadoc des types objets
 * 10/ Ctrl + shift + G sur le champs foo nous permet de trouver les references au champ foo
 * 11/ Ctrl + Shift + O permet d'organiser les imports
 * 12/ Ctrl + Shift + C permet de commenter la ligne ou on se trouve
 */

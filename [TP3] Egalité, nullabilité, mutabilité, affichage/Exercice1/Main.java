//LY-IENG Steven

public class Main{
		public static void main(String[] args) {
		var book = new Book("Da Vinci Code", "Dan Brown");
		System.out.println(book.title() + ' ' + book.author());
	}
}

//3 
/*
On obtient l'erreur
error : title has private access in Book 
on peut corriger ce problème en utilisant des accesseurs
c'est a dire au lieu d'utiliser 
book.title et book.author
on utilisera
book.title() et book.author()

*/

//4 voir fichier : Book.java

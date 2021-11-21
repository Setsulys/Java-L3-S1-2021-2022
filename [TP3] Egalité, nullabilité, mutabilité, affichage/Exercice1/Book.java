// LY-IENG Steven

import java.util.Objects;
//Exercice 1 Livre
/*
public record Book(String title, String author){
	public static void main(String[] args) {
		var book = new Book("Da Vinci Code", "Dan Brown");
		System.out.println(book.title + ' ' + book.author);
	}
}
*/

//2 Expliquer
/*
on obtient " Da Vinci code Dan Brown" car on concatene
le contenu de book.title et book.author avec un espace entre les deux
*/

//3 voir fichier : Main.java




//4 et 5
/*
public record Book(String title, String author){

	public Book{//verifie que le titre et que l'auteur soit bien non null
		Objects.requireNonNull(title,"title is null");
		Objects.requireNonNull(author,"author is null");
	}
	public static void main(String[] args) {

		var book = new Book("Da Vinci Code", "Dan Brown");
		var weirdBook = new Book(null, "oops");
		System.out.println(book.title + ' ' + book.author); //affichage du titre et du nom de l'auteur
		System.out.println(weirdBook.title + ' ' + weirdBook.author);
	}
}
*/


//6
/*
public record Book(String title, String author){
	public Book(String title, String author){//verifie que le titre et que l'auteur soit bien non null
		Objects.requireNonNull(title,"title is null");
		Objects.requireNonNull(author,"author is null");
		this.author=author;
		this.title=title;
	}
	public Book (String title){//verifie que le titre et que l'auteur soit bien non null
		this(title,"<no author>");
	}
	public static void main(String[] args) {

		var book = new Book("Da Vinci Code", "Dan Brown");
		var weirdBook = new Book("boook");
		System.out.println(book.title + ' ' + book.author); //affichage du titre et du nom de l'auteur
		System.out.println(weirdBook.title + ' ' + weirdBook.author);
	}
}
*/
//7 ????????????????????????????

//8
public record Book(String title, String author){
	public Book(String title, String author){//verifie que le titre et que l'auteur soit bien non null
		Objects.requireNonNull(title,"title is null");
		Objects.requireNonNull(author,"author is null");
		this.author=author;
		this.title=title;
	}
	public Book (String title){ //si on donne un titre sans auteur il sera marqué <no author>
		this(title,"<no author>");
	}
	public Book withTitle(String title,String author){
		return new Book(title,author);
	}
	public static void main(String[] args) {

		var book = new Book("Da Vinci Code", "Dan Brown");
		var weirdBook = new Book("boook");
		System.out.println(book.title + ' ' + book.author); //affichage du titre et du nom de l'auteur
		System.out.println(weirdBook.title + ' ' + weirdBook.author);
	}
}

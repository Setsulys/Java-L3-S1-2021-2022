// LY-IENG Steven

//Exercice 2 Libeté Egalité toString
//1
/*
public record Book(String title, String author){
	public static void main(String[] args) {
		var b1 = new Book("Da Java Code", "Duke Brown");
	    var b2 = b1;
	    var b3 = new Book("Da Java Code", "Duke Brown");

	    System.out.println(b1 == b2);
	    System.out.println(b1 == b3);
	}
}
*/
/*
Le code affiche
true
false
car pour b1 et b2 on va chercher le meme objet en memoire
alors que b3 est un nouvel objet en memoire different de b1 et b2
*/


//2Comment faire pour tester si deux objects ont le même contenu ?
//Ecrire le code qui affiche si b1, b2 et b1 et b3 ont le même contenu.
/* 
nous devons utiliser la methode equal pour verifier si b1 b2 et b3 ont le meme contenus
*/
/*
public record Book(String title, String author){
	public static void main(String[] args) {
		var b1 = new Book("Da Java Code", "Duke Brown");
	    var b2 = b1;
	    var b3 = new Book("Da Java Code", "Duke Brown");

	    System.out.println(b1.equals(b2));
	    System.out.println(b1.equals(b3));
	}
}
*/

//3
/*
public record Book(String title, String author){
	public static void main(String[] args) {
	    var book1 = new Book("Da Vinci Code", "Dan Brown");
  		var book2 = new Book("Angels & Demons", new String("Dan Brown"));
  			System.out.println(isFromTheSameAuthor(book1,book2));
	}

	public static boolean isFromTheSameAuthor(Book book1,Book book2){
			return book1.author.equals(book2.author);
	}

}
*/


//4 et 5

public record Book(String title, String author){
	public static void main(String[] args) {
        var javaBook = new Book("Da Java Code", "Duke Brown");
        System.out.println(javaBook);

	}
	@Override
	public String toString(){
		return title +" by "+ author;
	}
}


//6 A quoi sert l'annotation @Override ?
/*
On utilise l’annotation @Override pour aider à la lecture,
faire la différence entre une nouvelle méthode et le
remplacement d’une méthode existante
*/

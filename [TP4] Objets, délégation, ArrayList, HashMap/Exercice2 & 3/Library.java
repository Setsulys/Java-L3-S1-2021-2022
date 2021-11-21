//LY-IENG Steven

//Imports
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Objects;



//Exercice 2
//5 
/*La methode renvoie null au lieu d'une exception car on veut eviter d'arreter 
 * le programme et en meme temps verifier si une liste est valide 
 */

/*
public class Library {
	private final List<Book> books;


	public Library() {
		books = new ArrayList<Book>();
	}
	
	public void adding(Book livre) {
		Objects.requireNonNull(livre);
		books.add(livre);
	}
	
	public Book findByTitle(String title){
		for(var element : books) {
			if( element.title().equals(title))
				return element;
		}
		return null;
	}

	@Override
	public String toString() {
		var builder = new StringBuilder();
		for(Book book : books ) {
			builder.append(book.toString()).append("\n");
		}
		return builder +"\n";
	}
	
	public static void main(String args[]) {
		var library = new Library();
		   	library.adding( new Book("Ajin","Tsuina Miura"));
    		library.adding( new Book("Sky high survival","Tsuina Miura"));
    		library.adding( new Book("Nisekoi","Naoshi Komi"));
    		library.adding( new Book("Apple","Naoshi Komi"));
    		library.adding( new Book("Island","Naoshi Komi"));
    		library.adding( new Book("Personnant","Naoshi Komi"));
    		library.adding( new Book("Fairy tail","Hiro Mashima"));
    		library.adding( new Book("Monster Hunter Orage","Hiro Mashima"));
    		library.adding( new Book("Mashima En","Hiro Mashima"));
    		library.adding( new Book("Rave Master","Hiro Mashima"));
    		library.adding( new Book("Eden Zero","Hiro Mashima"));
    		library.adding( new Book("Dragon Ball","Akira Toriyama"));
    		library.adding( new Book("Dr Slump","Akira Toriyama"));
    		library.adding( new Book("City Hunter","Tsukasa Hojo"));
    		library.adding( new Book("Cat's Eyes","Tsukasa Hojo"));
    		library.adding( new Book("Angel Heart","Tsukasa Hojo"));
    		
		System.out.println("\nAffichage de findByTitle\n____________");
		System.out.println(library.findByTitle("Ajin"));
		System.out.println(library.findByTitle("Apple"));
		System.out.println(library.findByTitle("Rave Master"));
		System.out.println(library.findByTitle("Island"));
		System.out.println(library.findByTitle("Booo"));
		System.out.println("\nAffichage de la bibliotheque\n____________");
		System.out.println(library.toString());
	}
}
*/



//Exercice 3
// 1 
/*
la complexite de la methode findByTitle de la classe Library est de O(n)
*/

//2
/*
 * Java.util.HashMap est une implantation de donnee de Map 
 */

//4
/*
 * On prefere utiliser une classe librairy qu'un record car Hashmap fonctionne comme un dictionnaire
 */
//5
/*
 * On doit utiliser la methode entrySet() de java.util.HashMap pour obtenir les valeurs
 */
//6
/*
 * On remplace le type du champs maps HashMap par LinkedHashlmap en faisant une importation de LinkedHashMap idem dans le constructeur
 */


public class Library{
	private final Map<String,Book> maps;

	public Library() {
		maps = new LinkedHashMap<String , Book>();
	}
	
	public void add(Book livre) {
		Objects.requireNonNull(livre);
		maps.put(livre.title(),livre);
	}
	
    public Book findByTitle(String title) {
                return maps.getOrDefault(title, null);
    }

    
	public void removeAllBooksFromAuthor(String author) {
    	maps.entrySet().removeIf(element -> (element.getValue().author().equals(author)));
    }

	@Override
    public String toString() {
        var builder = new StringBuilder();
        for (var element : maps.entrySet()) {
        	var title = element.getKey();
        	var author = element.getValue().author();
            builder.append(title).append(" by ").append(author).append("\n");
        }
        return builder.toString();
    }
    
        public static void main(String[] args) {
            var library2 = new Library();
    		library2.add( new Book("Ajin","Tsuina Miura"));
    		library2.add( new Book("Sky high survival","Tsuina Miura"));
    		library2.add( new Book("Nisekoi","Naoshi Komi"));
    		library2.add( new Book("Apple","Naoshi Komi"));
    		library2.add( new Book("Island","Naoshi Komi"));
    		library2.add( new Book("Fairy tail","Hiro Mashima"));
    		library2.add( new Book("Monster Hunter Orage","Hiro Mashima"));
    		library2.add( new Book("Mashima En","Hiro Mashima"));
    		library2.add( new Book("Rave Master","Hiro Mashima"));
    		library2.add( new Book("Eden Zero","Hiro Mashima"));
    		
    		
    		library2.add( new Book("Dragon Ball","Akira Toriyama"));
    		library2.add( new Book("Dr Slump","Akira Toriyama"));
    		library2.add( new Book("City Hunter","Tsukasa Hojo"));
    		library2.add( new Book("Cat's Eyes","Tsukasa Hojo"));
    		library2.add( new Book("Angel Heart","Tsukasa Hojo"));
    		
    		
    		System.out.println("\nAffichage de findByTitle\n____________");
    		System.out.println(library2.findByTitle("Ajin"));
    		System.out.println(library2.findByTitle("Apple"));
    		System.out.println(library2.findByTitle("Rave Master"));
    		System.out.println(library2.findByTitle("Island"));
    		System.out.println(library2.findByTitle("Booo"));
    		System.out.println("\nAffichage de la bibliotheque\n____________");
    		System.out.println(library2.toString());
    		library2.removeAllBooksFromAuthor("Naoshi Komi");
    		System.out.println("\nAffichage de la bibliotheque \nsans Naoshi Komi\n____________");
    		System.out.println(library2.toString());
    		library2.removeAllBooksFromAuthor("Hiro Mashima");
    		System.out.println("\nAffichage de la bibliotheque \nsans Hiro Mashima\n____________");
    		System.out.println(library2.toString());
        }
}



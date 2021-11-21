package fr.uge.blockbuster.main;

import java.nio.charset.Charset;
import java.nio.file.Path;
import java.time.Duration;
import fr.uge.blockbuster.*;

public class Main {
	
	public static void main(String[] args) {
		
		var laserDisc = new LaserDisc("Jaws");
		var videoTape = new VideoTape("The Cotton Club", Duration.ofMinutes(128));
		var videoTape2 = new VideoTape("Mission Impossible", Duration.ofMinutes(110));
		var catalog = new Catalog();
		
		System.out.println("\nPartie 1 & 2\n__________\n");
		catalog.add(laserDisc);
		catalog.add(videoTape);
		catalog.add(videoTape2);
		//catalog.add(new LaserDisc("Mission Impossible")); //Exception
		//System.out.println(catalog);
		System.out.println(catalog.lookup("Jaws"));
		System.out.println(catalog.lookup("The Cotton Club"));
		System.out.println(catalog.lookup("Indiana Jones"));
		
		System.out.println("\nPartie 3\n__________\n");
		var laserDiscText = laserDisc.toText();
		var videoTapeText = videoTape.toText();
		System.out.println(laserDiscText);
		System.out.println(videoTapeText);
		
		var laserDisc2 = Article.fromText(laserDiscText);
		var videoTape3 = Article.fromText(videoTapeText);
		System.out.println(laserDisc.equals(laserDisc2));
		System.out.println(videoTape.equals(videoTape3));
		
		
		System.out.println("\nPartie 4\n__________\n");
		 var catalog2 = new Catalog();
	    catalog2.add(laserDisc);
	    catalog2.add(videoTape);
	    catalog2.save(Path.of("catalog.txt"));
		    
	    var catalog3 = new Catalog();
	    catalog3.load(Path.of("catalog.txt"));
	    System.out.println(catalog3.lookup("Jaws"));  // LaserDisc:Jaws
	    System.out.println(catalog3.lookup("The Cotton Club"));  // VideoTape:The Cotton Club:128
		
	    System.out.println("\nPartie 5\n__________\n");
	    var catalog4 = new Catalog();
	    catalog4.add(new LaserDisc("A Fistful of €"));
	    catalog4.add(new VideoTape("For a Few €s More", Duration.ofMinutes(132)));
	    catalog4.save(Path.of("catalog-windows-1252.txt"), Charset.forName("Windows-1252"));

	    var catalog5 = new Catalog();
	    catalog5.load(Path.of("catalog-windows-1252.txt"), Charset.forName("Windows-1252"));
	    System.out.println(catalog5.lookup("A Fistful of €"));
	    System.out.println(catalog5.lookup("For a Few €s More"));
	}
	
}


//Exercice 1
// 2 Quel doit etre le type du parametre de add et le type de retour de lookup?
//Que doit renvoyer lookup s'il n'y a ni cassette video ni laser disc ayant le nom demandé dans le catalogue?

/* Le type de parametre de add est Article et le type de retour de lookup est Article
 *
 * Lookup doit renvoyer une exception ? ou un null? ou un bool?si il n'y a ni cassette video ni laser discs
 * 		ayant le nom demandé
 */



//3 discuter du fait que le type des articles doit être scellé ou non ?

/*On peut si le magasin blockbuster le souhaite permettre de creer d'autres type de support que pourra contenir le catalogue 
 * cependant si ils ne le souahaitent pas on peut aussi tres bien utiliser une interface scellé pour permetre de n'utiliser que 
 * les deux type VideoTape et LaserDisc
 */



//4 Quelle méthode doit-on utiliser pour créer un écrivain sur un fichier texte à partir d'un Path ? 
//Comment doit-on faire pour garantir que la ressource système associée est bien libérée ?
//Comment doit-on gérer l'exception d'entrée/sortie ?

/* On doit utiliser une methode save avec un File.newBufferedWritter() //Je trouve que cette question est mal posée
 * 
 *Pour garantir que la resource système associée soit bien liberée ont doit utiliser une methode try qui fermera automatiquement
 *le fichier donné en paramettre 
 * 
 * On peut utiliser un throw IOExeption ou bien utiliser un Catch (IOException e)
 */





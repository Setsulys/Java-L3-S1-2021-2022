//LY-IENG Steven

//1 A quoi servent la classe java.util.regex.Pattern et sa méthode compile ?

/*
la classe java.util.regex.Pattern permet d'avoir une séquence a la quel on va pouvoir voir si 
une séquence correspond a ce pattern
*/
//A quoi sert la classe java.util.regex.Matcher ?
/*
la classe java.util.regex.Matcher permet de verifier si une séquence correspond a un Model(Pattern)
defini dans le Pattern
*/
import java.util.regex.Pattern;

//2

/*
public class Ex3{
	public static void main(String[] args) {
		var pattern = Pattern.compile("[0-9]+");
		for( var array : args){
			var matcher = pattern.matcher(array);
			if(matcher.matches()){
				System.out.print(matcher.group());
			}
		}
		System.out.println(" ");
	}
}
*/

public class Ex3{
	public static void main(String[] args) {
		var pattern = Pattern.compile("[a-z]*([0-9]+)");
		for( var array : args){
			var matcher = pattern.matcher(array);
			if(matcher.matches()){
				System.out.print(matcher.group(1));
			}
		}
		System.out.println(" ");
	}
}


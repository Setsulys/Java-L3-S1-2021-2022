//LY (LY-IENG) Steven 
//Exercice 4 Record et conversion de String en entier

public record Point(int x,int y){

	public double distance(){
		return Math.sqrt((x*x)+(y*y));
	}

	public static void main(String[] args){
		var x = Integer.parseInt(args[0]);
		var y = Integer.parseInt(args[1]);
		var p = new Point(x,y);
		System.out.println("x = "+p.x+", y="+p.y );
		System.out.println(p);
		System.out.println("dist="+p.distance());
	}
}

// 1 Pour compiler le fichier Point.java il faut utiliser la commande "javac Point.java"
// 3 "static" dans une methode
// 4 lorsque l'argument n'est pas un nombre nous aurons une erreur
// 6 distance aura comme type de retour un double et ne possedera pas de paramètres

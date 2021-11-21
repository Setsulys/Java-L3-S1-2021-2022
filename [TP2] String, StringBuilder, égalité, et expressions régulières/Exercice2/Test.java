
public class Test{

	public static void main(String[] args) {
		var first = args[0];
		var second = args[1];
		var last = args[2];
		System.out.println(first + ' ' + second + ' ' + last);
	}
}

//4 Pourquoi peut on utliser ' ' a la place de " "?
/*
Car nous n'utilisons pas une chaine de caractere mais un caractere uniquement
*/

//5 Dans quel cas doit-on utiliser StringBuilder.append() plutôt que le + ?

/*
On doit utiliser StringBuilder.append() plutot que le + dans une boucle
for car on evite de faire trop d'allocations de memoire
*/
//Et pourquoi est-ce que le chargé de TD va me faire les gros yeux si j'écris un + dans un appel à la méthode append?

/*
si on fait un + dans un StringBuilder.append() on ferra de l'allocation de memoire
en plus de le faire dans le stringBuilder ce qui est totalement inutile
*/

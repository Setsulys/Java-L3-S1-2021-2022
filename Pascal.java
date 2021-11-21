//LY (LY-IENG) Steven 
//Exercice 5 De C vers Java
public class Pascal{

	public static int pascal(int nBut, int pBut){
		int[] tab = new int[(nBut + 1)*4];
		int n,i;
		if(tab == null){
			System.out.println("Pas assez de place\n");
			return 0;
		}
		tab[0]=1;

		for(n = 1; n <= nBut; n++){
			tab[n]=1;

			for( i = n-1; i > 0; i--){
				tab[i] = tab[i-1] + tab[i];
			}
		}
	
	int result = tab[pBut];
	return result;
	}

	public static void main(String[] args){
		System.out.println("Cn, p= "+ pascal(30000, 250) +"\n");
	}
}


//Comment peut-on expliquer la difference de vitesse?

/*
La difference de vitesse entre le language C et le Java
s'explique avec le modèle d'execution.
Le modèle d'execution du C Passe directement du code source à
l'assembleur et tout est fait lors de la compilation tandis que
Le modèle d'execution du Java passe du Code Source puis par le 
Bytecode on passe aussi par l'interpreteur qui nous donne l'Assembleur

De plus le Modèle Java s'execute en deux parties (Compilation et Execution) alors
que le Modèle C tout passe par la Compilation
*/
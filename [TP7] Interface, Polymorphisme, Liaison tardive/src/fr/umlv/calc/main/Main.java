package fr.umlv.calc.main;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fr.umlv.calc.Expr;
import fr.umlv.calc.Expr.*;
public class Main {
	public static void main(String[] args) {
        Expr expression = new Add(new Value(2), new Value(3));
        Expr expression2 = new Sub(new Mul( new Value(2), new Value(3)), new Value(4));
        System.out.println(expression2.eval());	//2
        System.out.println(expression.eval());	//5
        
        Scanner scan = new Scanner("- * 2 3 4");
        Expr expression3 = null;
        expression3  = Expr.parse(scan);
        System.out.println(expression3);	//((2*3)-4)
        
        List<String> string = new ArrayList<String>();
        string.add("+");
        string.add("*");
        string.add("2");
        string.add("3");
        string.add("4");
        Expr expression4 = null;
        expression4 = Expr.parse(string.iterator());
        System.out.println(expression4);	//((2*3)+4)
        
      }
}


//4 Il y a un bug dans le code que l'on a écrit, on permet à n'importe qui d'implanter Expr mais cela ne marchera pas avec la méthode parse qui elle liste tous les sous-types possibles.
//Comment corriger ce problème ?
/* 
 * On corrige ce probleme en utilisant une interface sellée qui permet uniquement les class et records que l'on veut
 * */


//5 En fait, les records n'ont pas besoin d'être déclarés dans leur propre fichier .java, il peuvent être tous déclarés dans le fichier Expr.java en tant que membre (attribut) de la classe Expr.
//Faire le changement et expliquer pourquoi c'est intéressant.
/*
 * Il est interessent de faire ca car on encapsule encore plus les records on a pas a ecrire quels records seront permis par l'interface
 */


//7 Noter que prendre un Scanner en paramètre ne permet pas de ré-utiliser la méthode parse si, par exemple, l'expression à parser est stockée dans une List de String.
//Quelle interface que doit-on utiliser à la place de Scanner pour que l'on puisse appeler la méthode parse avec un Scanner ou à partir d'une List.
/*
 *On cree une liste et parse doit demander un iterator de cette liste te string;
 */


//9 Enfin, on peut voir que le code de eval dans Add, Sub et Mul est quasiment identique, dans les trois cas : la méthode eval est appelée sur left et right.
//On souhaite factoriser ce code (on ne le ferait probablement pas dans la vraie vie car il n'y a pas assez de code à partager, mais ce n'est pas la vraie vie, c'est un exercice) en introduisant un type intermédiaire BinOp, sous-type de Expr et super-type de Add, Sub et Mul.
//Le type BinOp doit-il être un record, une classe ou une interface ?
/*
 * Le type BinOp doit etre une interface qui implémente Mul Add Sub
 * */


//10 Sachant que l'on veut écrire eval dans BinOp, comment eval doit être déclarée ? 
//Et comment, dans eval de BinOp, peut-on accéder aux champs left et right, qui sont déclarés dans Add, Sub et Mul ?
/*
 * eval devra etre déclaré en tant que methode dans BinOp qui devra retourner la methode op que l'on aura defini dans Add, Sub , Mul
 * */


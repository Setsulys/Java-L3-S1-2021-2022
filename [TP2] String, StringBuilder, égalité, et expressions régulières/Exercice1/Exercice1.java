//LY-IENG Steven

//Exercice 1 Assignation, égalité, réference

//1 on considere le code suivant:

var s = "toto";
System.out.println(s.length());
/*
S a pour type le type string,
comme le type string est consideré comme un tableau
le compilateur reconnait qu'il existe la methode length()
*/


//2 Qu'affiche le code suivant? Expliquer.

var s1 = "toto";
var s2 = s1;
var s3 = new String(s1);

System.out.println(s1 == s2);
System.out.println(s1 == s3);

/*
cela affiche 
true 
false

car
System.out.println(s1 == s2);
s2 pointe sur s1 on teste l'adresse en memoire

System.out.println(s1 == s3);
car s1 et s3 n'ont pas la meme adresse memoire
*/


//3 Quelle est la méthode à utiliser si l'on veut tester si le contenu des chaînes de caractères est le même ?
var s4 = "toto";
var s5 = new String(s4);

System.out.println(/* comparer contenue de s4 et s5 */);

/*
il faut utiliser la methode 'equals' pour comparer 2 strings
*/


//4 Qu'affiche le code suivant ? Expliquer.
var s6 = "toto";
var s7 = "toto";

System.out.println(s6 == s7);

/*
Le code affiche true, car on test pas le contenu mais l'adresse en memoire
*/

//5 Expliquer pourquoi il est important que java.lang.String ne soit pas mutable.

/*
java.lang.String n'est pas mutable car 
comme il sont non mutable il peuvent etre partagés
*/


//6 Qu'affiche le code suivant ?

var s8 = "hello";
s8.toUpperCase();
System.out.println(s8);

/*
le code suivant affiche :
hello
et non HELLO car on affiche s8 et non l'instance
s8.toUpperCase() 
*/

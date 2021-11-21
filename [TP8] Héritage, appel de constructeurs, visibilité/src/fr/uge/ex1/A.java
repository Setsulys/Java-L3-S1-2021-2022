package fr.uge.ex1;

public class A {
	int x = 1;

	   public int getX() {
	     return x;
	   }

	   static void printX(A a) {
	     System.out.println("in A.printX");
	     System.out.println("x " + a.x);
	     System.out.println("getX() " + a.getX());
	   }

	   int m(A a) { return 1; }
}

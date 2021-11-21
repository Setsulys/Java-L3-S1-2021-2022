package fr.uge.ex1;

public class B extends A{
	int x = 2;

	   public int getX() {
	     return x;
	   }

	   static void printX(B b) {
	     System.out.println("in B.printX");
	     System.out.println("x " + b.x);
	     System.out.println("getX() " + b.getX());
	   }

	   int m(B b) { return 2; }
}

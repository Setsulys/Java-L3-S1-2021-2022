package fr.umlv.calc;


import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;


public sealed interface Expr{
		
	int eval();
	
	public static Expr parse(Scanner scan) {
		if(scan.hasNext()){
			String str = scan.next();
			
			return switch(str) {
			case "+" ->	new Add(parse(scan),parse(scan));
			case "-" ->	new Sub(parse(scan),parse(scan));
			case "*" ->	new Mul(parse(scan),parse(scan));
			default  -> new Value(Integer.parseInt(str));		
			};
		}
		return null;
	}
	
	public static Expr parse(Iterator<String> iterator) {
		if(iterator.hasNext()) {
			var str=iterator.next();

			return switch(str) {
			case "+" ->	 new Add(parse(iterator),parse(iterator));
			case "-" ->	 new Sub(parse(iterator),parse(iterator));
			case "*" ->	 new Mul(parse(iterator),parse(iterator));
			default  ->  new Value(Integer.parseInt(str));

			};
		}
		return null;
	}
	
	public sealed interface BinOp extends Expr{
		
		public Expr left();
		public Expr right();
		public int op(int left,int right);
	
		public default int eval() {
			return op(left().eval(),right().eval());
		}
	}
	
	public record Add(Expr left,Expr right) implements BinOp {
		
		public Add {
			Objects.requireNonNull(left);
			Objects.requireNonNull(right);
		}
		
		@Override 
		public String toString() {
			return "("+ left +" + "+ right +")"; 
		}

		@Override
		public int op(int left, int right) {
			return left + right;
		}
	}

 
	public record Mul(Expr left,Expr right) implements BinOp {
		
		public Mul(Expr left,Expr right) {
			this.left = left;
			this.right = right;
		}
		
		@Override 
		public String toString() {
			return "("+ left +" * "+ right +")"; 
		}

		@Override
		public int op(int left, int right) {
			return left * right;
		}
	}


	public record Sub(Expr left,Expr right) implements BinOp {
		
		public Sub(Expr left,Expr right) {
			this.left = left;
			this.right = right;
		}
		
		@Override 
		public String toString() {
			return "("+ left +" - "+ right +")"; 
		}
		@Override
		public int op(int left, int right) {
			return left - right;
		}
	}

	public record Value(int nombre) implements Expr {
		
		public Value(int nombre) {
			this.nombre = nombre;
		}
		
		@Override
		public int eval() {
			return nombre;
		}
		
		@Override
		public String toString() {
			return "" + nombre;
		}
	}
	
}

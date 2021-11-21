package fr.umlv.calc;

public record Mul(Expr left,Expr right) implements Expr {
	
	public Mul(Expr left,Expr right) {
		this.left = left;
		this.right = right;
	}
	@Override
	public int eval() {
		return left.eval()*right.eval();
	}
}

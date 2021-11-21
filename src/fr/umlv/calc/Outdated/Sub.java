package fr.umlv.calc;

public record Sub(Expr left,Expr right) implements Expr {
	
	public Sub(Expr left,Expr right) {
		this.left = left;
		this.right = right;
	}
	@Override
	public int eval() {
		return left.eval()-right.eval();
	}
}


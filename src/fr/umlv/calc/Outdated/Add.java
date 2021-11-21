package fr.umlv.calc;

public record Add(Expr left,Expr right) implements Expr {
	
	public Add(Expr left,Expr right) {
		this.left = left;
		this.right = right;
	}
	@Override
	public int eval() {
		return left.eval()+right.eval();
	}
}

package fr.umlv.calc;

public record Value(int nombre) implements Expr {
	
	public Value(int nombre) {
		this.nombre = nombre;
	}
	@Override
	public int eval() {
		return nombre;
	}
}

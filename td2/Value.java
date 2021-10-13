package fr.dauphine.javaavance.td2;
public class Value implements Expr{
private double val;

	
	public Value(double val) {
		this.val = val;
	}
	@Override
	public double eval() {
		return this.val;
	}
	public double getVal() {
		return val;
	}
	
}

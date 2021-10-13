package fr.dauphine.javaavance.td2;

public class Add implements Expr {
	private Expr  valeur1;
	private Expr  valeur2;

	public Add(Expr val1, Expr val2) {
		this.valeur1 = val1;
		this.valeur2 = val2;
		}
	
	public double eval() {
		return this.valeur1.getVal()+this.valeur2.getVal(); 
	}
	
	@Override
	public double getVal() {
		return this.eval();
	}
}

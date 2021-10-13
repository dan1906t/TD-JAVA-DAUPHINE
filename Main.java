package fr.dauphine.javaavance.td2;
public class Main {
	public static void main(String[] args) {
		Expr val = new Value(1337.0);
		System.out.println(val.eval()); 
		Expr add = new Add(new Value(327.0), val);
		System.out.println(add.eval());
		Expr e = new Add(new Value(350.0), add);
		System.out.println(e.eval());
	}
}

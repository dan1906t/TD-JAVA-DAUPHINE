package voi;

public class Bike extends Vehicule{
	private String marque;
	private static final int valeur=100;
	
public Bike(String marque)
{
	this.marque=marque;
}

public String getMarque()
{
	return marque;
}
public int getValeur(){
	return valeur;
}
}

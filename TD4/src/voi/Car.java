package voi;

public class Car extends Vehicule{
	private final String brand;
	private final long value;
	private short vetuste;
	private boolean en_solde;
	public Car(String brand,long value,short vetuste,boolean en_solde) throws IllegalArgumentException
	{
		if(value<0)
		{
			throw new IllegalArgumentException("Erreur la valeur ne doit pas être négative");
		}
		for(int i =0;i<vetuste;i++)
		{
			value-=1000;
		}
		this.brand=brand;
		this.value=value;
		this.vetuste=vetuste;
		this.en_solde=en_solde;
	}
	public boolean getEnSolde()
	{
		return this.en_solde;
	}
	
	public void setEnSolde(boolean en_solde)
	{
		this.en_solde=en_solde;
	}
	public String getBrand()
	{
		return this.brand;
	}
	
	public long getValue()
	{
		return this.value;
	}
	public String toString()
	{
		return "La marque de la voiture est "+this.brand+"Sa valeur est "+this.value;
	}
	public short getVetuste()
	{
		return this.vetuste;
	}
	public boolean equals(Object O)
	{
		boolean bool=false;
		if(!(O instanceof Car))
		{
			return false;
		}
		Car c = (Car)O;
		if(c.getValue()==this.value && c.getBrand()==this.brand && c.getVetuste()==this.vetuste)
			{
				bool=true;
			}
				
		return bool;
		
	}
	
	public static void main(String[] args) {
		
		
		
	}
	
	
	
}

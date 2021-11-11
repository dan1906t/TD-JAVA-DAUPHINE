package voi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class Garage {
	private static int id;
	private int taille;
	private ArrayList<Car> liste = new ArrayList<Car>();
	private ArrayList<Bike> listeB = new ArrayList<Bike>();
	private ArrayList<Vehicule> listeV = new ArrayList<Vehicule>();
	StringBuilder sb = new StringBuilder();
public Garage(int id)
{
	this.id=id;
	this.liste=new ArrayList<Car>();
	this.listeB=new ArrayList<Bike>();
}
public Garage()
{
	
}
public void add (Car c)  {
	/*if(c==null)
	{
		Objects.requireNonNull(c, "La voiture ne doit pas etre null");
	}
	else
	{
		this.liste.add(c);
	}*/
	this.liste.add(Objects.requireNonNull(c));	
	
}
public void addBike (Bike b)  {
	/*if(c==null)
	{
		Objects.requireNonNull(c, "La voiture ne doit pas etre null");
	}
	else
	{
		this.liste.add(c);
	}*/
	this.listeB.add(Objects.requireNonNull(b));	
	
}
public void remove(Car c)
{
	this.liste.remove(c);
}
private int getId()
{
	return this.id;
}
public String toString()
{
	
	for(int i=0;i<liste.size();i++)
	{
		sb.append(liste.get(i).toString());
	}
	return sb.toString();
}
public int somme()
{
	int cumul=0;
	for(Car c : liste)
	{
		cumul+=c.getValue();
	}
	return cumul;
}

public Car firstCarByBrand(String brand){
	Car a = null;
	boolean bool=false;
	for(Car c : liste)
	{
		if(c.getBrand().equals(brand))
		{
			a=c;
			bool=true;
		}
		else
		{
			a=null;
		}
	}
	return a;
}
public void Solde() {
	for(Car c : liste)
	{
		if(c.getEnSolde())
		{
			liste.remove(c);
			Car c2 = new Car(c.getBrand(),Discount.getValueDiscount(),c.getVetuste(),c.getEnSolde());
			liste.add(c2);
		}
	}
}
public void protectionism(String brand)
{
	Iterator<Car> I = this.liste.iterator();
	int test=0;
	while(I.hasNext())
	{
		if(I.next().getBrand().equals(brand))
		{
			I.remove();
			test++;
		}
	}
}

public static void main(String[] args) {
	Car a = new Car("Audi",10000,(short)1,true);
	Car b = new Car("BMW",9000,(short)3,false);
	Car c = new Car("BMW",9000,(short)3,false);
	Car d = a;
	/*System.out.println(a==b);
	System.out.println(b==c);
	System.out.println(a==d);
	System.out.println(a.equals(b));
	System.out.println(b.equals(c));
	System.out.println(a.equals(d));
	*/
	Garage g = new Garage();
	ArrayList<Car> list = new ArrayList<>();
	
	list.add(a);
	list.add(b);
	/*
	System.out.println(list.indexOf(a));
	System.out.println(list.indexOf(b));
	System.out.println(list.indexOf(c));
	*/
	
	HashSet<Car> set = new HashSet<Car>();
	set.add(b);
	System.out.println(set.contains(b));
	
}
}

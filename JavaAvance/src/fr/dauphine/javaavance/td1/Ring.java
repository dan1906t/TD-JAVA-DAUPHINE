package fr.dauphine.javaavance.td1;

public class Ring extends Circle{
	private int rad2;
	public Ring(int rad, Point p,int rad2) throws Exception {
		super(rad, p);
		this.rad2=rad2;
		if(rad>this.rad2)
		{	
			throw (new Exception("Condition non respectée")) ;
		}
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		
	}
	public boolean contains(Point p)
	{
		boolean bool=false;
		if(Math.sqrt(Math.pow(p.getX()-getCentre().getX(),2) + Math.pow(p.getY()-this.getCentre().getY(),2))< this.rad2)
		{
			bool=true;
		}
		
		return bool;
		
	}
	
	
	
}

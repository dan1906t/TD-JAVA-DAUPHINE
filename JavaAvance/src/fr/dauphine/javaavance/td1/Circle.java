package fr.dauphine.javaavance.td1;

public class Circle {

	private int radius;
	private Point centre;
	
	public Circle(int rad, Point p) {
		this.radius = rad;
		this.centre = new Point(p);
	}
	
	

	public Point getCentre() {
		return new Point(centre);
	}
	
	@Override
	public String toString(){
		return "Les coordonnées du cercle sont " + this.radius + " et " + this.centre + " son aire est  " + this.area(); 
	}
	
	public void translate(int dx, int dy) {
		this.centre.translate(dx, dy);
	}
	
	public double area() {
		return (Math.PI *  Math.pow(radius, radius));
	}
	
	public boolean contains(Point p)
	{
		boolean bool=false;
		if(Math.sqrt(Math.pow(p.getX()-this.centre.getX(),2) + Math.pow(p.getY()-this.centre.getY(),2))< this.radius)
		{
			bool=true;
		}
		
		return bool;
	}
	
	public static void main(String[] args) {
		Circle c=new Circle(2,new Point(1,2));
		c.getCentre().translate(5,2);
		

	}

}

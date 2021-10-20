package fr.dauphine.javaavance.td1;

import java.util.ArrayList;

public class Point {

	private int x;
	private int y;
	

	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(Point p2) {
		this.x = p2.x;
		this.y = p2.y;	
	}
	
	public void afficher() {
		int x = 0;
		int y = 0;
		Point p = new Point(x,y);
		System.out.println(p.x + p.getY());
	}
	
	@Override
	public String toString() {
		return "Les coordonnées sont :"+ this.x+ " "+this.y;
	}
	
	@Override
	public boolean equals(Object o)
	{	
		Point point =  (Point)o;
		return this.x==point.x && this.y==point.y;
	}
	
	public boolean isSameAs(Point p)
	{
		boolean bool=true;
		if(p.x==this.x && p.y==this.y)
		{
			bool=true;
		}
		else {
			bool=false;
		}
		return bool;
	}
	
	public static void main(String[] args) {
		int x = 4;
		int y = 4;
		Point point = new Point(x,y);
		System.out.println(point);
		Point p1=new Point(1,2);
		Point p2=p1;
		Point p3=new Point(1,2);
		ArrayList<Point> list = new ArrayList<>();
		list.add(p1);
		System.out.println(list.indexOf(p2));
		System.out.println(list.indexOf(p3));
		
	}
	
	public void translate(int dx, int dy) {
		this.x = dx;
		this.y = dy;
	}

	public int getY() {
		return y;
	}

	public int getX() {
		return this.x;
	}
}

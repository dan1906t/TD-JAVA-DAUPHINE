package fr.dauphine.javaavance.td1;

public class TestPoint {
	private int x;
	private int y;
	
	public TestPoint(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	public static void main(String[] args) {
		Point p=new Point(1,2);
		System.out.println(p.getX()+" "+p.getY());
	}
}

package fr.dauphine.javaavance.td1;

import java.util.LinkedList;

public class Polyline {

	private LinkedList<Point> PolyLinkedList = new LinkedList<Point>();
	
	public int pointCapacity()
		{
			return PolyLinkedList.size();
		}
	public int nbPoints()
		{
			int nb=0;
			for(int i =0;i<PolyLinkedList.size();i++)
			{
				if(!PolyLinkedList.get(i).equals(null))
				{
					nb++;
				}
			}
			return nb;
		}
	
	public Polyline(LinkedList<Point> lesP) {
		this.PolyLinkedList = lesP;
	}
	
	public void add(Point p) {
		for (int i = 0; i < PolyLinkedList.size();i++) {
			if (this.PolyLinkedList.get(i).equals(null)) {
				this.PolyLinkedList.add(p);
			}
		}
	}
	
	
	
	
	public boolean contains(Point p)
	{
		boolean bool=false;
		for (Point point : PolyLinkedList) {
			if(point.isSameAs(p))
			{
				bool=true;
			}
		}
		return bool;
				
	}
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Melange {
	
	public <T> void swap(List<T> L,int i, int j)
	{
		if(i>=L.size() || j>=L.size() || i<0 || j<0)
		{
			throw new IndexOutOfBoundsException("Erreur de limite");
		}
		T t1 = L.get(i);
		T t2 = L.get(j);
		
		//On inverse
		L.set(j, t1);
		L.set(i, t2);
		
	}
	public <T> void melanger(List<T> L)
	{
		Random r  = new Random();
		
		for(int i=0;i<L.size();i++)
		{
			int j = r.nextInt(i+1);
			swap(L,i,j);
		}
	}
	public <T> void melanger(LinkedList<T> L)
	{
		Random r  = new Random();
		
		for(int i=0;i<L.size();i++)
		{
			int j = r.nextInt(i+1);
			Collections.shuffle(L,r);
		}
	}
	public static void main(String[] args) {
		Melange m = new Melange();
		LinkedList<Integer> l = new LinkedList<Integer>();
		List<Integer> l2 = new ArrayList<>();
        l.add(15);
        l.add(30);
        l.add(8);
        l.add(2);
        l2.add(15);
        l2.add(30);
        l2.add(8);
        l2.add(2);
        System.out.println(l);
        System.out.println(l2);
        
        m.melanger(l);
        System.out.println("Après mélange");
        System.out.println(l);
        System.out.println(l2);
        
	}

}

public class MyList2<X> {
	private Cell2<X> C;
	private int taille=0;

public MyList2(Cell2<X> C,int taille){
		this.C=C;
		this.taille=taille;
	}
public MyList2()
{
	
}
public void add(X ded)
{
	
	Cell2<X> C = new Cell2<X>(ded);
	taille++;
}
public int size()
{
	return taille;
}
public String toString()
{
	String s ="";
	for(int i=0;i<taille;i++)
	{
		s+=C.getDed()+",";
	}
	return s;
}
public void addLast(X ded)
{
	for(int i=0;i<taille;i++)
	{
		C=this.C.getRef();
	}
	Cell2<X> c = new Cell2<X>(ded);
	
}
public void add(X ded,int i)
{
	for(int j=0;j<taille;j++)
	{
		if(j>i)
		{
			Cell2<X> c = new Cell2<X>(ded);
			taille++;
		}
	}
}
public X get(int i)
{	
	X test = null;
	for(int j=0;i<taille;j++)
	{
		if(j==i)
		{
			test=this.C.getDed();
		}
	}
	return test;
}
public int summLetters() {
	int cumul=0;
	for(int i =0;i<taille;i++) {
		cumul+=C.getDed().toString().length();
	}
	return cumul;
}
public boolean contains(Object X)
{
	boolean bool=false;
	for(int i=0;i<taille;i++)
	{
		if(C.getDed().equals(X))
		{
			bool=true;
		}
	}
	return bool;
}
}

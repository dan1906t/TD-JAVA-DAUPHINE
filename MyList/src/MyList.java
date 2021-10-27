
public class MyList {
	private Cell C;
	private int taille=0;
	StringBuilder sb = new StringBuilder();
	
public MyList(Cell c,int taille)
{
	this.C=c;
	this.taille=taille;
}
public MyList()
{
	
}
public void add(String s)
{
	
	Cell c = new Cell(s,this.C);
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
		s+=C.getS()+",";
	}
	return s;
}
public String toString2Builder()
{
	String s ="";
	for(int i=0;i<taille;i++)
	{
		s+=sb.append(C.getS()+",");
	}
	return s;
}
public void addLast(String s)
{
	for(int i=0;i<taille;i++)
	{
		C=this.C.getRef();
	}
	Cell c = new Cell(s,C);
	
}
public void add(String s,int i)
{
	for(int j=0;j<taille;j++)
	{
		if(j>i)
		{
			Cell c = new Cell(s,this.C);
			taille++;
		}
	}
}
public String get(int i)
{
	for(int j=0;i<taille;j++)
	{
		if(j==i)
		{
			return this.C.getS();
		}
	}
	return "";
}
public int summLetters() {
	int cumul=0;
	for(int i =0;i<taille;i++) {
		cumul+=C.getS().length();
	}
	return cumul;
}
public static void main(String[] args) {
	MyList m1 = new MyList();
	m1.addLast("tatu");
	m1.add("toto");
	m1.add("titi");
	m1.addLast("tutu");
}


}
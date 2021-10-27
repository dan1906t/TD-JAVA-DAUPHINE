public class Cell {
	private String s;
	private Cell reference_suivant;
	
public Cell(String s,Cell ref_sui)
{
	this.s=s;
	this.reference_suivant=ref_sui;
	
}
public void setS(String s)
{
	this.s=s;
}
public String getS() {
	return s;
}

public void setRef(Cell ref)
{
	this.reference_suivant=ref;
}

public Cell getRef()
{
	return this.reference_suivant;
}

}

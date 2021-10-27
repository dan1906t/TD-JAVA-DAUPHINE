
public class Cell2<X> {
	private X ded;
	private Cell2<X> reference_suivant;
	
	public Cell2(X ded)
	{
		this.ded=ded;
		
	}
	public void setDed(X ded)
	{
		this.ded=ded;
	}
	public X getDed() {
		return ded;
	}

	public void setRef(Cell2 <X> reference_suivant)
	{
		this.reference_suivant=reference_suivant;
	}

	public Cell2<X> getRef()
	{
		return this.reference_suivant;
	}
}

package voi;

public class Discount {
	private static int value=2000;
	

public Discount(int value)
{
	this.value=value;
}

public static int getValueDiscount()
{
	return value;
}

public void setValue(int value)
{
	this.value=value;
}

}

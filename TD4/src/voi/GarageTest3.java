package voi;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class GarageTest3 {

	@Test
	void protectionnism() {
			Garage l = new Garage();
			Car a = new Car("Audi",10000,(short)1,true);
			Car b = new Car("BMW",9000,(short)3,false);
			Car c = new Car("BMW",9000,(short)3,false);
			l.add(a);
			l.add(b);
			l.add(c);
			l.protectionism("BMW");
		
			assertEquals(9000, l.somme());
		}
	@Test
	void Solde()
	{
		Garage l = new Garage();
		Car a = new Car("Audi",10000,(short)1,true);
		l.add(a);
		l.Solde();
		assertEquals(1000,l.somme());
	}

}

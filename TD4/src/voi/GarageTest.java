package voi;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class GarageTest {

	@Test
	public void Somme() {
		Garage l = new Garage();
		Car a = new Car("Audi",10000,(short)1,true);
		Car b = new Car("BMW",5000,(short)3,false);
		Car c = new Car("BMW",9000,(short)3,false);
		l.add(a);
		l.add(b);
		l.add(c);
		assertEquals(17000, l.somme());
	}
	
	@Test
	public void FirstCarByBrand() {
		Garage l = new Garage();
		Car a = new Car("Audi",10000,(short)1,true);
		Car b = new Car("BMW",9000,(short)3,false);
		Car c = new Car("BMW",9000,(short)3,false);
		l.add(a);
		l.add(b);
		l.add(c);
		assertEquals(b, l.firstCarByBrand("BMW"));
	}
	
	

}

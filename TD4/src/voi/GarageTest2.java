package voi;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GarageTest2 {

	@Test
	void remove() {
		Garage l = new Garage();
		Car a = new Car("Audi",10000,(short)1,true);
		Car b = new Car("BMW",9000,(short)3,false);
		Car c = new Car("BMW",9000,(short)3,false);
		l.add(a);
		l.add(b);
		l.add(c);
		l.remove(a);
		assertEquals(12000, l.somme());
	}

}

package voi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTest2 {

	@Test
	void equals() {
		Garage l = new Garage();
		Car a = new Car("Audi",10000,(short)2,true);
		Car c = new Car("Audi",10000,(short)2,true);
		Bike b = new Bike("BMW");
		l.add(a);
		l.add(c);
		l.addBike(b);
		assertEquals(false, a.equals(b));
	}

}

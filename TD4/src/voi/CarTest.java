package voi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTest {

	@Test
	void vetuste() {
		Garage l = new Garage();
		Car a = new Car("Audi",10000,(short)2,true);
		l.add(a);
		assertEquals(8000, a.getValue());
		
		
	}

}

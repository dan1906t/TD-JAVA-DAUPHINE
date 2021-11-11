package voi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BikeTest {

	@Test
	void Test() {
		Bike b = new Bike("BMW");
		assertEquals("BMW", b.getMarque());
		assertEquals(100, b.getValeur());
	}

}

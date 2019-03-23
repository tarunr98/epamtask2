import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testAdd() {
		Calculator cal=new Calculator();
		assertEquals(1,cal.Add(0,1));
		assertEquals(8,cal.Add(4,4));
		assertEquals(18,cal.Add(16,2));
		
		
	}

	@Test
	void testMultiply() {
		Calculator cal=new Calculator();
		assertEquals(0,cal.Multiply(0,1));
		assertEquals(16,cal.Multiply(4,4));
		assertEquals(32,cal.Multiply(16,2));
	}

	@Test
	void testDivision() {
		Calculator cal=new Calculator();
		assertEquals(0,cal.Division(0,1));
		assertEquals(1,cal.Division(4,4));
		assertEquals(8,cal.Division(16,2));
	}

}

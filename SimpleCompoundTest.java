import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleCompoundTest {

	@Test
	void testSimpleIntrest() {
		SimpleCompound sc=new SimpleCompound(200, 5, 2);
		assertEquals(20,sc.SimpleIntrest());
		SimpleCompound sc1=new SimpleCompound(1000, 5, 10);
		assertEquals(500,sc1.SimpleIntrest());
	}

	@Test
	void testCompoundIntrest() {
		SimpleCompound sc= new SimpleCompound(100, 100, 2);
		assertEquals(400, sc.CompoundIntrest());
		SimpleCompound sc1= new SimpleCompound(10, 200, 3);
		assertEquals(270, sc1.CompoundIntrest());
	}

}

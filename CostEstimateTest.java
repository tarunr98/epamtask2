import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CostEstimateTest {

	@Test
	void testFindCost() {
		CostEstimate c1;
		c1 = new CostEstimate(0, 125, false);
		assertEquals(150000.0, c1.findCost());
		c1 = new CostEstimate(1, 250, false);
		assertEquals(375000.0, c1.findCost());
		c1 = new CostEstimate(2, 2, true);
		assertEquals(5000, c1.findCost());
		c1 = new CostEstimate(2, 2, false);
		assertEquals(3600, c1.findCost());
		
	}

}

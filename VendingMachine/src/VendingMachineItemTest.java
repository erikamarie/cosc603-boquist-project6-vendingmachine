import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Erika Boquist
 *
 * Class for testing vending machine items class
 */
public class VendingMachineItemTest {
	
	//VendingMachineItem Constructor Tests
	
	/**
	 * Tests the VendingMachineItem with a positive price.
	 */
	@Test
	public void testVendItemCostructPos() {
		
		String testName = "testName";
		double testPricePos = 1;
		
		VendingMachineItem tester = new VendingMachineItem(testName, testPricePos);
	}
	/**
	 * Tests the VendingMachineItem with a negative price.
	 */
	@Test (expected = VendingMachineException.class)
	public void testVendItemCostructNeg() throws Exception{
		
		String testName = "testName";
		double testPriceNeg = -1;
		
		VendingMachineItem tester = new VendingMachineItem(testName, testPriceNeg);
	}
	/**
	 * Tests the VendingMachineItem with a zero price.
	 */
	@Test
	public void testVendItemCostructZero() {
		
		String testName = "testName";
		double testPriceZero = 0;
		
		VendingMachineItem tester = new VendingMachineItem(testName, testPriceZero);
	}
	
	
	//String getName() Test
	/**
	 * Tests the VendingMachineItem getName method.
	 */
	@Test
	public void testVendItemGetName() {
		
		String testName = "testName";
		double testPricePos = 1;
		
		VendingMachineItem tester = new VendingMachineItem(testName, testPricePos);
		
		assertEquals("testName", testName, tester.getName());
	}
	
	//String getPrice()
	/**
	 * Tests the VendingMachineItem getPrice method.
	 */
	@Test
	public void testVendItemGetPrice() {
		
		String testName = "testName";
		double testPricePos = 1;
		
		VendingMachineItem tester = new VendingMachineItem(testName, testPricePos);
		
		assertEquals("testPricePos", testPricePos, tester.getPrice(), 0);
	}

}

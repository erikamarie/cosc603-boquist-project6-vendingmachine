import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Erika Boquist
 *
 * Class for testing vending machine class
 */
public class VendingMachineTest {
	
	//void addItem(VendingMachineItem item, String code)
	/**
	 * Tests the VendingMachine addItem method with an empty slot.
	 */
	@Test
	public void testVendAddItem(){
		String testName = "testName";
		double testPricePos = 1;
		
		VendingMachineItem testItem = new VendingMachineItem(testName, testPricePos);
		VendingMachine testMachine = new VendingMachine();
		
		testMachine.addItem(testItem, "A");
	}
	/**
	 * Tests the VendingMachine addItem method with a full slot, should throw exception.
	 */
	@Test (expected = VendingMachineException.class)
	public void testVendAddItemFull() throws Exception{
		String testName = "testName";
		double testPricePos = 1;
		
		VendingMachineItem testItem = new VendingMachineItem(testName, testPricePos);
		VendingMachineItem testItem2 = new VendingMachineItem(testName, testPricePos);
		VendingMachine testMachine = new VendingMachine();
		
		testMachine.addItem(testItem, "A");
		testMachine.addItem(testItem2, "A");
	}
	/**
	 * Tests the VendingMachine addItem method with an empty slot, but incorrect
	 * slot code, should throw exception.
	 */
	@Test (expected = VendingMachineException.class)
	public void testVendAddItemCode() throws Exception{
		String testName = "testName";
		double testPricePos = 1;
		
		VendingMachineItem testItem = new VendingMachineItem(testName, testPricePos);
		VendingMachine testMachine = new VendingMachine();
		
		testMachine.addItem(testItem, "F");
	}
	
	//VendingMachineItem removeItem(String code)
	
	//void insertMoney(double amount)
	
	//double getBalance()
	
	//boolean makePurchase()
	
	//double returnChange()

}

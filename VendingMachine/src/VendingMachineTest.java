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
	/**
	 * Tests the VendingMachine removeItem method
	 */
	@Test
	public void testVendRemoveItem(){
		String testName = "testName";
		double testPricePos = 1;
		
		VendingMachineItem testItem = new VendingMachineItem(testName, testPricePos);
		VendingMachine testMachine = new VendingMachine();
		
		testMachine.addItem(testItem, "A");
		testMachine.removeItem("A");
	}
	
	/**
	 * Tests the VendingMachine removeItem with an invalid slot code, 
	 * should throw an exception
	 */
	@Test (expected = VendingMachineException.class)
	public void testVendRemoveItemCode() throws Exception{
		String testName = "testName";
		double testPricePos = 1;
		
		VendingMachineItem testItem = new VendingMachineItem(testName, testPricePos);
		VendingMachine testMachine = new VendingMachine();
		
		testMachine.addItem(testItem, "A");
		testMachine.removeItem("F");
	}
	/**
	 * Tests the VendingMachine removeItem method with an empty slot
	 */
	@Test (expected = VendingMachineException.class)
	public void testVendRemoveItemEmpty() throws Exception{
		VendingMachine testMachine = new VendingMachine();
		
		testMachine.removeItem("A");
	}
	//void insertMoney(double amount)
	/**
	 * Tests the VendingMachine insertMoney method
	 */
	@Test
	public void testVendInsertMoney(){
		double moneyAmount = 5;
		VendingMachine testMachine = new VendingMachine();
		
		testMachine.insertMoney(moneyAmount);
		assertEquals("testGetBalance", moneyAmount, testMachine.getBalance(), 0);
		testMachine.insertMoney(moneyAmount);
		assertEquals("testGetBalance2", moneyAmount*2, testMachine.getBalance(), 0);
		
	}
	/**
	 * Tests the VendingMachine insertMoney method with moneyAmount < 0,
	 * should throw exception
	 */
	@Test (expected = VendingMachineException.class)
	public void testVendInsertMoneyAmount() throws Exception{
		double moneyAmount = -5;
		VendingMachine testMachine = new VendingMachine();
		
		testMachine.insertMoney(moneyAmount);
		
		
	}
	//double getBalance()
	/**
	 * Tests the VendingMachine getBalance method
	 */
	@Test
	public void testVendGetBalance(){
		double moneyAmount = 5;
		VendingMachine testMachine = new VendingMachine();
		
		assertEquals("testGetBalance", 0, testMachine.getBalance(), 0);
		testMachine.insertMoney(moneyAmount);
		assertEquals("testGetBalance1", moneyAmount, testMachine.getBalance(), 0);
		testMachine.insertMoney(moneyAmount);
		assertEquals("testGetBalance2", moneyAmount*2, testMachine.getBalance(), 0);
		
	}
	//boolean makePurchase()
	
	//double returnChange()

}

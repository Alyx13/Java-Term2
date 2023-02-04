package fall22lab4;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
/** 
 * The purpose of this class and exercise, is to understand how to properly use
 * J-unit. This class was used to test out methods and to make sure the expected 
 * output is the correct output.
 * @author Alexandre Valiquette
 * @version [1]
 */
public class YourPurchasesTest2Test {
	
	/**
	 * Epsilon used within our test
	 */
	private static final double EPSILON = 1E-12;
	
	@Test
	public void testCalculateChangeUpdated() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(1.5);
		aPurchase.receivePayment(5, 0, 0, 0, 0);
		double changeResult = aPurchase.CalculateChange();
		double expected = 6.50;
	    Assert.assertEquals(expected, changeResult, EPSILON);
		assertTrue(true);
		
	}
	
}
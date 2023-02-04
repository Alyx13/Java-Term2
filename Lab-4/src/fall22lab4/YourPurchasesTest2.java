/**
 * File name: TestDemo.java
 * @author Alexandre Valiquette,ID#040998420
 * Course: CST8284-OOP
 * Assignement: [Lab-4]
 * Date: [2022/10/15]
 * Professor: [Justin Martins]
 */
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
public class YourPurchasesTest2 {
	
	/**
	 * Epsilon used within our test
	 */
	private static final double EPSILON = 1E-12;
	
	//THIS TEST WOULD FAIL. 
	// TODO: WRITE ONE OR MORE TESTS TO SYSTEMATICALLY FIND THE SOURCE OF THE TEST FAILURE 
//	@Test
//	public void testCalculateChange() {
//		YourPurchases aPurchase = new YourPurchases();
//		aPurchase.recordPurchase(1.5);
//		aPurchase.receivePayment(5, 0, 0, 0, 0);
//		double changeResult = aPurchase.CalculateChange();
//		double expected = 3.50;
//	    Assert.assertEquals(expected, changeResult, EPSILON);
//		assertTrue(true);
//		
//	}
	
	 // YOUR TASKS ARE STATED HERE: 
	   // RUN THE TEST CASE IN YourPurchasesTest2.java, TO SHOW AN EXAMPLE OF AN UNSUCCESSFUL EXECUTION
	   // IMPROVE THIS CODE BY SYSTEMATICALLY ADDING MORE TEST CASES (NOT ALREADY STATED IN THIS CODE)
	   // TO LOCATE THE METHOD THAT IS CAUSING THE TEST FAILURE
	   
	   // ADD NEW TEST CASES HERE!!!
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

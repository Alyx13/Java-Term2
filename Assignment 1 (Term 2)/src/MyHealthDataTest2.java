import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
/** 
 * The purpose of this class is to the test some values, with the help of J-unit.
 * We will be testing that our BMI calculations work correctly and give us the expected output.
 * @author Alexandre Valiquette
 * @version [1]
 */
public class MyHealthDataTest2 {
	
	/**
	 * Epsilon used within our test
	 */
	private static final double EPSILON = 1E-12;

//	@Test
//	public void testGetBMI() {
//		MyHealthData patient = new MyHealthData(null, null, null, 0, 0, 0, 0);
//		patient.setHeight(68.4);
//		patient.setWeight(140);
//		double result = patient.getBMI();
//		double expected = 21.03638726445744;
//	    Assert.assertEquals(expected, result, EPSILON);
//		assertTrue(true);
//	}
	
	@Test
	public void testGetBMI1() {
		MyHealthData patient1 = new MyHealthData(null, null, null, 0, 0, 0, 0);
		patient1.setHeight(68.4);
		patient1.setWeight(140);
		double result = patient1.getBMI();
		double expected = 22.03638726445744;
	    Assert.assertEquals(expected, result, EPSILON);
		assertTrue(true);
	}

}

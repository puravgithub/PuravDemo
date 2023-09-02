package examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateTaxTest {
	
	@Test
	public void testcase1() {
		CalculateTax clt = new CalculateTax();
		int expectedResult = 750 ;
		int actualResult = clt.Caltax(5000, 15);
		assertEquals(expectedResult,actualResult);
		
	}

}

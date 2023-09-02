package examples;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	@Test
	public void testcase1() {
		Calculator c = new Calculator();
		int expectedResult = 10;
		int actualResult = c.add(5, 5);
		assertEquals(expectedResult,actualResult);
	}
	
	@Test
	public void testcase2(){
		Calculator c = new Calculator();
		int expectedResult = 15;
		int actualResult = c.substraction(30,15);
		assertEquals(expectedResult, actualResult);
	}

}

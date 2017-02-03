package se.hiflyer.kata;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class FibonacciTest {

	private FibonacciGenerator fibonacciGenerator;

	@Before
	public void setUp() throws Exception {
		fibonacciGenerator = new FibonacciGenerator();
	}

	@Test
	public void firstNumberIsZero() throws Exception {
		long number = fibonacciGenerator.get(0);
		assertEquals(0, number);
	}

	@Test
	public void secondNumberIsOne() throws Exception {
		long number = fibonacciGenerator.get(1);
		assertEquals(1, number);
	}

	@Test
	public void thirdNumberIsOne() throws Exception {
		long number = fibonacciGenerator.get(2);
		assertEquals(1, number);
	}

	@Test(timeout = 1000L)
	public void fortySeventhNumberIs2971215073() throws Exception {
		long number = fibonacciGenerator.get(47);
		assertEquals(2971215073L, number);
	}

	@Test
	public void eightyThirdNumberIs99194853094755497() throws Exception {
		long number = fibonacciGenerator.get(83);
		assertEquals(99194853094755497L, number);
	}

	@Test(expected = IllegalArgumentException.class)
	public void minusNumberCausesException() throws Exception {
		fibonacciGenerator.get(-1);
	}

	@Test
	public void tooLargeOrdinalOverflows() throws Exception {
		try {
			fibonacciGenerator.get(95);
			fail();
		} catch (IllegalArgumentException ignored) {
		}
	}
}

package org.junittesting;

import math.ArithmeticOperations;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.Rule;

public class ArithmeticOperationsTest {

	ArithmeticOperations mm = new ArithmeticOperations();

	@Test(expected = ArithmeticException.class)
	public void test_divide() {
		mm.divide(10,0);
	}

	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void test_multiply_negative() {
		 mm.multiply(3, 23);
		 thrown.expectMessage("x & y should be >= 0");
	}
	
	@Test
	public void test_multiply_integer() {
		mm.multiply(2, 102999998);
		thrown.expectMessage("The product does not fit in an Integer variable");
	}
}

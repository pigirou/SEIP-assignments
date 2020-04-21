package org.junittesting;

import org.junit.Test;

import math.MyMath;

public class MyMathTest {
	MyMath a = new MyMath();

	@Test(expected = IllegalArgumentException.class)
	public void test_factorial_zero() {
		a.factorial(0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test_factorial_twelve() {
		a.factorial(12);
	}

}

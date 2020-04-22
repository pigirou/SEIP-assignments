package org.junittesting;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import math.MyMath;

public class MyMathTest {
	MyMath a = new MyMath();

	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void test_factorial_zero() {
		 thrown.expectMessage("The number should be above 0");
		a.factorial(-1);
	}
	
	@Test
	public void test_factorial_twelve() {
		thrown.expectMessage("The number should be below 12");
		a.factorial(13);
	}

	@Test 
	public void test_isprime_nonvalid() {
		thrown.expectMessage("The number given should be above or equal to 2");
		a.isPrime(0);
	}
	
	@Test 
	public void test_isprime_valid() {
		int expected = 3;
		Assert.assertEquals(expected, a.isPrime(3));
	}
	
	
}

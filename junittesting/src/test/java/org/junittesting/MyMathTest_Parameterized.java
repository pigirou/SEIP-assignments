package org.junittesting;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import math.MyMath;

@RunWith(Parameterized.class)
public class MyMathTest_Parameterized {

	@Parameter(value = 0)
	public int n;
	@Parameter(value = 1)
	public int result;

	MyMath mm = new MyMath();

	@Parameters
	public static Collection<Object[]> data(){
		Object[][] data = new Object[][] {{0,1},{1,1},{2,2},{3,6},{4,24},{5,120},{6,720},{7,5040},{8,40320},{9,362880},{10,3628800},{11,39916800},{12,479001600}};
		return Arrays.asList(data);
	}

	@Test
	public void test_factorial() {
		Assert.assertEquals(result, mm.factorial(n));
	}

}

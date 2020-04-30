
package math;
import math.ArithmeticOperations;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.Rule;
import org.junit.Assert;


public class ArithmeticOperationsTest {
	
	ArithmeticOperations mm = new ArithmeticOperations();

	@Test(expected = ArithmeticException.class)
	public void test_divide_zero_denominator() {
		mm.divide(10,0);
	}
	
	@Test
	public void test_divide_zero_nominator() {
		Assert.assertEquals(0, mm.divide(0,5), 0.000001);
	}
	
	@Test 
	public void test_divide_normal_case() {
		Assert.assertEquals(10,mm.divide(100,10), 0.00000001);
	}
	

	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void test_multiply_negative() {
		 thrown.expectMessage("x & y should be >= 0");
		 mm.multiply(-3, -23);
		
	}
	
	@Test
	public void test_multiply_integer() {
		thrown.expectMessage("The product does not fit in an Integer variable");
		mm.multiply(1000000, 12392837);
			}


}




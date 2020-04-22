package math;

/**
 * A class that calculates mathematical operations in order to demonstrate Unit
 * Testing.
 * 
 * @author pigirou (pigi.rou@gmail.com)
 */

public class MyMath {
	/**
	 * Receives an integer number as input and calculates the factorial. Throws
	 * IllegalArgumentException when the number does not lie between 0 and 12
	 */

	public static int factorial(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("The number should be above 0");
		}
		if (n > 12) {
			throw new IllegalArgumentException("The number should be below 12");
		}
		int f = 1;
		for (int i = 2; i <= n; i++) {
			f = f * i;
		}
		return f;
	}

	public boolean isPrime(int n) {
		boolean flag = false;
		if (n < 2) {
			throw new IllegalArgumentException("The number given should be above or equal to 2");
		}
		else {
			
		}

		for (int i = 2; i <= n / 2; ++i) {
			if (n % i == 0) {
				flag = true;
				break;
			}
		}
		return flag;
	}

}

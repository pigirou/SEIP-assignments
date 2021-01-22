package math;

/**
 * A class that calculates mathematical operations in order to demonstrate Unit
 * Testing.
 * 
 * @author pigirou 
 * @version 1.0
 * @since 2020-04-22
 */

public class MyMath {
	/**
	 * Receives an integer number as input and calculates the factorial. 
	 * @param n the number given as input to calculate the factorial
	 * @return the factorial of the parameter/number n 
	 * @exception IllegalArgumentException when n is below 0 or above 12 
	 */

	public int factorial(int n) {
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

	/**
	 * Method that finds if a number is prime.
	 * @param n the number given as input to calculate if it is prime
	 * @return a boolean variable that is true when the number is prime and false if it's not 
	 * @exception IllegalArgumentException when n is below 2
	 */
	public boolean isPrime(int n) {
		boolean flag = true;
		if (n < 2) {
			throw new IllegalArgumentException("The number given should be above or equal to 2");
		}
		else {
			
		}

		for (int i = 2; i <= n / 2; ++i) {
			if (n % i == 0) {
				flag = false ;
				break;
			}
		}
		return flag;
	}

}

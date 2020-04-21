package math;

public class MyMath {
	
	/*DON'T FORGET TO ADD JAVADOC COMMENTS*/

	public static int factorial(int n) {
		if (n<0 || n>12) {
			throw new IllegalArgumentException("The number should lie between 0 and 12");
		}
		int f = 1;
		for (int i = 2; i <= n; i++) {
			f = f * i;
		}
		return f;
	}

}

package math;


import math.ArrayOperations;
import math.MyMath;
import static org.mockito.Mockito.*;

import org.junit.Assert;
import org.junit.Test;

import io.FileIO;

public class ArrayOperationsTest {
	ArrayOperations mm = new ArrayOperations();
	public static String resourcesPath = "src/test/resources/";

	
	@Test 
	public void test_findPrimesinFile_Mocking() {
		MyMath m = mock(MyMath.class);
		FileIO f = mock(FileIO.class);
		

		when(m.isPrime(2)).thenReturn(true);
		when(m.isPrime(4)).thenReturn(false);
		when(m.isPrime(5)).thenReturn(true);
		when(m.isPrime(7)).thenReturn(true);
		when(m.isPrime(8)).thenReturn(false);
		when(m.isPrime(12)).thenReturn(false);
		when(m.isPrime(34)).thenReturn(false);
		when(m.isPrime(6)).thenReturn(false);
		
		String primes_filepath = resourcesPath.concat("primes.txt");
		int[] valid= {2,4,5,7,8,12,34,6};
		when(f.readFile(primes_filepath)).thenReturn(valid);
		
		
		Assert.assertArrayEquals(new int[] {2,5,7}, mm.findPrimesInFile(f, primes_filepath, m));
		
	}

}

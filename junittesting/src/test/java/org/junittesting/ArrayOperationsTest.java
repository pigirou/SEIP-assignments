package org.junittesting;

import math.ArrayOperations;
import math.MyMath;
import static org.mockito.Mockito.*;

import org.junit.Assert;
import org.junit.Test;

import io.FileIO;

public class ArrayOperationsTest {
	ArrayOperations mm;
	public static String resourcesPath = "src\test\resources";

	
	@Test 
	public void test_findPrimesinFile_Mocking() {
		MyMath m = mock(MyMath.class);
		FileIO f = mock(FileIO.class);
		String valid_filepath = resourcesPath + "example_resource.txt";
		
		when(m.isPrime(7)).thenReturn(true);
		when(m.isPrime(5)).thenReturn(true);
		when(m.isPrime(32)).thenReturn(false);
		int[] valid= {5,5,10};
		when(f.readFile(valid_filepath)).thenReturn(valid);
		
		String primes_filepath = resourcesPath + "primes.txt";
		Assert.assertArrayEquals(new int[] {2,5,7}, mm.findPrimesInFile(f, primes_filepath, m));
		
	}

}

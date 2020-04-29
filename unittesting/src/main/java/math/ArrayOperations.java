package math;

import java.util.ArrayList;
import java.util.List;

import io.FileIO;

/**
 * The ArrayOperations class executes math operations with the use of arrays
 *
 * @author proussou
 * @version 1.0
 * @since 2020-04-22
 */
public class ArrayOperations {

	/**
	 * Reads a file through an object of the the FileIO class and returns all prime
	 * numbers in that file
	 * 
	 * @param fileIo
	 *            an object of the class FileIO
	 * @param filepath
	 *            the path of the file used in the method
	 * @param myMath
	 *            an object of the class MyMath
	 * @return an array of prime numbers included in the file given
	 */

	
	public int[] findPrimesInFile(FileIO fileIo, String filepath, MyMath myMath) {
		int ar[] = fileIo.readFile(filepath);
		List<Integer> primes = new ArrayList<>();
		boolean prime = false;
		for (int i = 0; i < ar.length; i++) {
			prime = myMath.isPrime(ar[i]);
			if (prime == true) {
				primes.add(ar[i]);
			}
		}
		
		//Convert from list to array to return valid type 
		return primes.stream().mapToInt(i -> i).toArray();
	}
	

}

package math;

import io.FileIO;

public class ArrayOperations {
	
	/*TO DO: ADD JAVADOC COMMENTS*/
	
	public int[] findPrimesInFile(FileIO fileIo, String filepath, MyMath myMath) {
		int ar[] =fileIo.readFile(filepath);
		int primes[] = null;
		int c=0;
		boolean prime = false;
		for (int i =0 ; i< ar.length ; i++) {
			prime= myMath.isPrime(ar[i]);
			if (prime == true) {
				primes[c]= ar[i];
				c++;
			}
		}
		
		return primes;
	}

}

package io;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

//import io.FileIO;

public class FileIOTest {

	FileIO mm = new FileIO();
	public static String resourcesPath = "src/test/resources/";

	@Test
	public void test_readFile_successfully() {
		int[] expectedNumbers = new int[] {5,8,10,4,1};
		String filepath = resourcesPath.concat("example_resource.txt") ;
		Assert.assertArrayEquals(expectedNumbers, mm.readFile(filepath));

	}
	
	@Test 
	public void testReadFileContainsInvalidEntries() {
		int num_expected[] = new int[] {3,8};
		
		String filepath_nonintegers = resourcesPath.concat("noninteger_example.txt") ;
		Assert.assertArrayEquals(num_expected, mm.readFile(filepath_nonintegers));
		
	}

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void test_readfile_non_existing_file() {
		String filepath_nonexisting = resourcesPath + "example.txt";
		thrown.expectMessage("Input file does not exist");
		mm.readFile(filepath_nonexisting);

	}

	@Test
	public void test_readfile_empty() {
		String filepath_empty = resourcesPath + "emptyexample.txt";
		thrown.expectMessage("Given file is empty");
		mm.readFile(filepath_empty);
	}
	
}

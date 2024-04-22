package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class MoreFunctionTest {
	
	
	@Test
	public void testSumUpToN() {
		// Testing sumUpToN() function
		int result = MoreFunctions.sumUpToN(5); // Sum of numbers from 1 to 5 is 15
		Assert.assertEquals(15, result);
	}
	
	@Test
	public void testCountEvenNumbers() {
		// Testing countEvenNumbers() function
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Array with 5 even numbers
		int count = MoreFunctions.countEvenNumbers(numbers);
		Assert.assertEquals(5, count);
	}
	
	@Test
	public void testSumUpToZero() {
		// Testing sumUpToN() function with zero
		int result = MoreFunctions.sumUpToN(0); // Sum of numbers from 1 to 0 should be 0
		Assert.assertEquals(0, result);
	}
	
	@Test
	public void testSumUpToNegativeNumber() {
		// Testing sumUpToN() function with a negative number
		int result = MoreFunctions.sumUpToN(-5); // Sum of numbers from 1 to -5 should throw an exception
		Assert.assertEquals(0, result); // Since an exception is thrown, result will be 0
	}
	
	@Test
	public void testCountEvenNumbersWithNoEvenNumbers() {
		// Testing countEvenNumbers() function with an array containing no even numbers
		int[] numbers = {1, 3, 5, 7, 9}; // Array with no even numbers
		int count = MoreFunctions.countEvenNumbers(numbers);
		Assert.assertEquals(0, count);
	}
	
	@Test
	public void testCountEvenNumbersWithAllEvenNumbers() {
		// Testing countEvenNumbers() function with an array containing all even numbers
		int[] numbers = {2, 4, 6, 8, 10}; // Array with all even numbers
		int count = MoreFunctions.countEvenNumbers(numbers);
		Assert.assertEquals(5, count);
	}
	
	@Test
	public void testCountEvenNumbersWithOneEvenNumber() {
		// Testing countEvenNumbers() function with an array containing only one even number
		int[] numbers = {3, 5, 7, 8, 9}; // Array with only one even number
		int count = MoreFunctions.countEvenNumbers(numbers);
		Assert.assertEquals(1, count);
	}
}
package sit707_week6;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class MoreFunctionTest {

    @Test
    public void testFindMaxOccurringElement() {
        // Testing findMaxOccurringElement() function
        int[] numbers = {1, 2, 3, 4, 2, 2, 4, 4, 5, 5, 5}; // 2 and 4 occur the most (3 times)
        int result = MoreFunctions.findMaxOccurringElement(numbers);
        Assert.assertEquals(2, result); // Either 2 or 4 is expected as the result
    }

    @Test
    public void testFibonacciSeries() {
        // Testing fibonacciSeries() function
        int[] expected = {0, 1, 1, 2, 3, 5, 8}; // Fibonacci series up to 8
        int[] result = MoreFunctions.fibonacciSeries(7); // Generate Fibonacci series up to 8
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testIsPalindrome() {
        // Testing isPalindrome() function
        String palindrome = "level";
        String nonPalindrome = "hello";
        Assert.assertTrue(MoreFunctions.isPalindrome(palindrome)); // "level" is a palindrome
        Assert.assertFalse(MoreFunctions.isPalindrome(nonPalindrome)); // "hello" is not a palindrome
    }
    
    @Test
    public void testFindMaxOccurringElementWithAllUniqueElements() {
        // Testing findMaxOccurringElement() function with an array containing all unique elements
        int[] numbers = {1, 2, 3, 4, 5}; // All elements are unique
        int result = MoreFunctions.findMaxOccurringElement(numbers);
        Assert.assertEquals(1, result); // Any element can be considered the maximum occurring element
    }

    @Test
    public void testFibonacciSeriesWithZero() {
        // Testing fibonacciSeries() function with zero
        int[] expected = {}; // Empty Fibonacci series for n = 0
        int[] result = MoreFunctions.fibonacciSeries(0); // Generate Fibonacci series up to 0
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testIsPalindromeWithEmptyString() {
        // Testing isPalindrome() function with an empty string
        String emptyString = "";
        Assert.assertTrue(MoreFunctions.isPalindrome(emptyString)); // An empty string is a palindrome
    }
}

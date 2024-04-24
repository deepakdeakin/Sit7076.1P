package sit707_week6;

public class MoreFunctions {

    // Function 1: Find Maximum Occurring Element
    public static int findMaxOccurringElement(int[] numbers) {
        int maxCount = 0;
        int maxElement = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            int count = 1;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxElement = numbers[i];
            }
        }
        return maxElement;
    }

    // Function 2: Generate Fibonacci Series
    public static int[] fibonacciSeries(int n) {
        if (n <= 0) {
            return new int[0]; // Return an empty array if n is 0 or negative
        }
        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        if (n > 1) {
            fibonacci[1] = 1;
            for (int i = 2; i < n; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
        }
        return fibonacci;
    }

    // Function 3: Check Palindrome String
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
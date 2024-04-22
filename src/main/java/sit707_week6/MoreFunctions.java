package sit707_week6;

public class MoreFunctions {
	
	// Function 1: Conditional loop with simple statements
		public static int sumUpToN(int n) {
			int sum = 0;
			for (int i = 1; i <= n; i++) {
				sum += i;
			}
			return sum;
		}
		
		// Function 2: Conditional loop with a conditional statement
		public static int countEvenNumbers(int[] numbers) {
			int count = 0;
			for (int num : numbers) {
				if (num % 2 == 0) {
					count++;
				}
			}
			return count;
		}

}

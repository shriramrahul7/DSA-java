import java.util.Scanner;

class BinarySearch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		allFib(n);

		scan.close();
	}

	static void allFib(int n) {
		int[] memo = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println(i + ": " + fib(i, memo));
		}
		// O(n)
	}

	static int fib(int n, int[] memo) {
		if (n <= 0) // 1
			return 0;
		else if (n == 1)
			return 1; // 1
		else if (memo[n] != 0)
			return memo[n]; // 1

		memo[n] = fib(n - 1, memo) + fib(n - 2, memo);
		// O(1) + O(1) as fib(n-1) and fib(n-2) has already been computed it
		// is just a lookup in the memoized array
		return memo[n];
	}
}

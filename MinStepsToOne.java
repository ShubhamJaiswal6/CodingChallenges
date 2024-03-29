/*
You are given a positive integer 'N’. Your task is to find and return the minimum number of steps that 'N' has to take to get reduced to 1.
You can perform any one of the following 3 steps:
1) Subtract 1 from it. (n = n - ­1) ,
2) If n is divisible by 2, divide by 2.( if n % 2 == 0, then n = n / 2 ) ,
3) If n is divisible by 3, divide by 3. (if n % 3 == 0, then n = n / 3 ).
For example:
Given:
‘N’ = 4, it will take 2 steps to reduce it to 1, i.e., first divide it by 2 giving 2 and then subtract 1, giving 1.
 */

public class MinStepsToOne {

	public static int countStepsToOne(int n) {
		if (n <= 1)
			return 0;

		int[] dp = new int[n + 1];
		dp[1] = 0;

		for (int i = 2; i <= n; i++) {
			dp[i] = 1 + dp[i - 1];
			if (i % 2 == 0) {
				dp[i] = Math.min(dp[i], 1 + dp[i / 2]);
			}
			if (i % 3 == 0) {
				dp[i] = Math.min(dp[i], 1 + dp[i / 3]);
			}
		}
		return dp[n];
	}

	public static void main(String[] args) {
		int n = 26;
		System.out.println(countStepsToOne(n));
	}

}

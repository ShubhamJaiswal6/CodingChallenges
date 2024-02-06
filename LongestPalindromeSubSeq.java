/*You have been given a string ‘A’ consisting of lower case English letters. Your task is to find the length of the longest palindromic subsequence in ‘A’.
A subsequence is a sequence generated from a string after deleting some or no characters of the string without changing the order of the remaining string characters.
(i.e. “ace” is a subsequence of “abcde” while “aec” is not).
A string is said to be palindrome if the reverse of the string is the same as the actual string.
For example, “abba” is a palindrome, but “abbc” is not a palindrome.
*/

public class LongestPalindromeSubSeq {

	public static int longestPalindromeSubseq(String s) {
		int n = s.length();
		int[][] dp = new int[n][n];

		for (int i = n - 1; i >= 0; i--) {
			dp[i][i] = 1;
			for (int j = i + 1; j < n; j++) {
				if (s.charAt(i) == s.charAt(j)) {
					dp[i][j] = dp[i + 1][j - 1] + 2;
				} else {
					dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
				}
			}
		}

		return dp[0][n - 1];
	}

	public static void main(String[] args) {
		String str = "abcdcbd";
		System.out.println(longestPalindromeSubseq(str));
	}

}

/*Given an array of numbers, find the maximum sum of any contiguous subarray of the array.
For example, given the array [34, -50, 42, 14, -5, 86], the maximum sum would be 137,
since we would take elements 42, 14, -5, and 86.
Given the array [-5, -1, -8, -9], the maximum sum would be -1.
Follow up: Do this in O(N) time.
*/

public class MaxSubarraySum {

	public static int maxSubArraySum(int[] arr) {
		if (arr == null || arr.length == 0) {
			return 0;
		}
		int maxEndingHere = arr[0];
		int maxSoFar = arr[0];

		for (int i = 1; i < arr.length; i++) {
			maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
			maxSoFar = Math.max(maxSoFar, maxEndingHere);
		}
		return maxSoFar;
	}

	public static void main(String[] args) {
		int[] arr1 = { 34, -50, 42, 14, -5, 86 };
		System.out.println("Maximum Subarray Sum: " + maxSubArraySum(arr1));

		int[] arr2 = { -5, -1, -8, -9 };
		System.out.println("Maximum Subarray Sum: " + maxSubArraySum(arr2));
	}

}

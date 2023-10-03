/*
Problem Statement:
You are given an array of integers nums and an integer target.
Your task is to find and return a pair of distinct indices (i, j) from the nums array such that nums[i] + nums[j] equals the given target.
It is guaranteed that there is exactly one solution for this problem, and each element of the array can only be used once.

Return the indices (i, j) as an array, and the order of the indices does not matter.

Example:
Input:
nums = [2, 7, 11, 15], target = 9

Output:
[0, 1]

Explanation:
In the given nums array, nums[0] (which is 2) and nums[1] (which is 7) add up to the target value of 9, so the function returns [0, 1].
*/

public class SumTargetChallenge {

	static int[] TwoSum(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;

		while (left < right) {
			int sum = nums[left] + nums[right];

			if (sum == target) {
				return new int[] { left, right };
			} else if (sum < target) {
				left++;
			} else {
				right--;
			}
		}

		// if no solution is found, return an empty array
		return new int[0];
	}

	public static void main(String[] args) {

		int[] nums = { 2, 7, 11, 15 };
		int target = 9;

		int result[] = TwoSum(nums, target);
		
		System.out.println("Output : ["+result[0]+", "+ result[1]+"]");
	}
}

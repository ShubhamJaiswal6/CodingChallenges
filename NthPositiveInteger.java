/*
  In a series of numbers where each number is such that the sum of its digits equals 10.
  Given an integer value 'N', your task is to find the N-th positive integer whose sum of digits equals to 10.
  */

public class NthPositiveInteger {

	public static long findNthPositiveInteger(long n) {
		if (n <= 0)
			return 0;

		long count = 0;
		long num = 19;

		while (count < n) {
			if (digitSumEquals10(num)) {
				count++;
			}
			if (count < n)
				num += 9;
		}
		return num;
	}

	public static boolean digitSumEquals10(long n) {
		long sum = 0;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum == 10;
	}

	public static void main(String[] args) {
		System.out.println(findNthPositiveInteger(5));
	}

}

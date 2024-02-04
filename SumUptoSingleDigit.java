/*
You have been given an array/list ‘arr’ of length ‘N’, which contains single digit elements at every index.
Your task is to return the sum of all elements of the array. But the final sum should also be a single digit.
To keep the output single digit - you need to keep adding the digits of the output number till a single digit is left.

For example:
For the given array [5, 8, 4, 9]

The sum of the elements of the array will be
5 + 8 + 4 + 9 = 26.
Since 26 is not a single-digit number, we will again take the sum of the digits of 26. 
2 + 6 = 8.
Now 8 is a single-digit number. So we will stop here and return 8.
*/

import java.util.ArrayList;

public class SumUptoSingleDigit {

	public static int specialSum(ArrayList<Integer> arr, int n ) {
		int sum=0;
		for(int i : arr) {
			sum+=i;
		}
		return 1+(sum-1)%9;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(8);
        arr.add(4);
        arr.add(9);
        int n = arr.size();
        int result = specialSum(arr,n);
        System.out.println("Special Sum: " + result);
	}

}

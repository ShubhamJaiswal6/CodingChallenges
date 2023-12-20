using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace HelloWorld
{
	public class MinSubArray
	{
	  public static int MinSubArrayLen(int target, int[] nums){
	    int start = 0;
	    int minLength = int.MaxValue;
	    int currentSum = 0;
	    
	    for(int end=0; end<nums.Length; end++){
	      currentSum+= nums[end];
	      
	      while (currentSum>=target){
	        minLength = Math.Min(minLength, end-start+1);
	        currentSum -= nums[start];
	        start++;
	      }
	    }
	    return minLength == int.MaxValue ? 0: minLength;
	  }
	  
		public static void Main(string[] args)
		{
		    int target1 = 7;
        int[] nums1 = {2, 3, 1, 2, 4, 3};
		  
			Console.WriteLine(MinSubArrayLen(target1, nums1));
		}
	}
}
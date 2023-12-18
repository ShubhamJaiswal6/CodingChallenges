using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace HelloWorld
{
	public class SortArray
	{
	  public static void SortColorsArray(int[] nums){
	    int low = 0;
	    int mid = 0;
	    int high = nums.Length - 1;
	    
	    while(mid<=high){
	      switch(nums[mid]){
	        case 0:
	          Swap(nums, low, mid);
	          low++;
	          mid++;
	          break;
	          
	        case 1:
	          mid++;
	          break;
	          
	        case 2:
	          Swap(nums, mid, high);
	          high--;
	          break;
	      }
	    }
	  }
	  
	  private static void Swap(int[] nums, int i, int j){
	    int temp = nums[i];
	    nums[i] = nums[j];
	    nums[j] = temp;
	  }
	  
		public static void Main(string[] args)
		{
			int[] nums = {2, 0, 2, 1, 1, 0};
			
			Console.WriteLine("Original: "+ string.Join(", ",nums));
			
			SortColorsArray(nums);
			
			Console.WriteLine("Sorted: "+ string.Join(", ", nums));
		}
	}
}
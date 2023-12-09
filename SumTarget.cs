using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace SumTarget
{
	public class SumTarget
	{
	  public static int[] TwoNumSum(int[] arr, int target){
	    
	    Dictionary<int, int> numIndices = new Dictionary<int, int>();
	    
	    for(int i=0; i<arr.Length; i++){
	      
	      int Complement = target - arr[i];
	      
	      if(numIndices.ContainsKey(Complement)){
	        return new int [] {numIndices[Complement], i};
	      }
	      
	      if(!numIndices.ContainsKey(arr[i])){
	      numIndices.Add(arr[i], i);
	      }
	    }
	    
	    return null;
	  }
	  
		public static void Main(string[] args)
		{
			  int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        int[] result = TwoNumSum(nums, target);
        
        if(result != null){
          Console.WriteLine($"Indices that sums upto {target} are : [{result[0]},{result[1]}]");
        }
		}
	}
}
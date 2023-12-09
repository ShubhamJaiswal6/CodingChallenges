using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace CountDuplicatesUsingCollections
{
	public class CountDuplicatesUsingCollections
	{
	  
	  public static void CountDuplicates(int[] arr){
	    
	    Dictionary<int, int> countMap = new Dictionary<int, int>();
	    
	    foreach(int i in arr)
	    {
	      if(countMap.ContainsKey(i)){
	        countMap[i]++;
	      }
	      else
	      {
	        countMap[i]=1;
	      }
	    }
	    
	    foreach (var entry in countMap)
	    {
	      if(entry.Value > 1)
	      {
	        Console.WriteLine($"Element {entry.Key} is duplicated {entry.Value - 1} times.");
	      }
	    }
	    
	  }
	  
		public static void Main(string[] args)
		{
			int [] input = {6,1,3,3,4,3,3};
			CountDuplicates(input);
		}
	}
}
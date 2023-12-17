using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace HelloWorld
{
	public class ContainerWithMostWater
	{
	  public static int MaxArea(int [] height){
	    int maxArea = 0;
	    int left = 0;
	    int right = height.Length - 1;
	    
	    while(left<right){
	      int h = Math.Min(height[left], height[right]);
	      int w = right - left;
	      int area = h*w;
	      maxArea = Math.Max(maxArea, area);
	      
  	    if(height[left] < height[right]){
  	      left++;
  	    }
  	    else
  	    {
  	      right--;
  	    }
	    }
	    
	    return maxArea;
	  }
	  
		public static void Main(string[] args)
		{
		    int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int result = MaxArea(height);
        
			Console.WriteLine(result);
		}
	}
}
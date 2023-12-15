using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace PrintPrimeNumOptimised
{
	public class Program
	{
		public static void Main(string[] args)
		{
		  int n = 100;
		  
		  for(int i=2; i<=n; i++){
		    bool isPrime = true;
		    
		    if(i>2 && i%2==0){
		      isPrime = false;
		    }else{
		      for(int j=3; j*j<=i; j+=2){
		        if(i%j == 0){
		          isPrime = false;
		          break;
		        }
		      }
		    }
		    
		    if(isPrime)
		      Console.Write(i+" ");
		  }
		}
	}
}
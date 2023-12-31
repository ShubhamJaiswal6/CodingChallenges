import java.util.*;

public class CheckPrimeNumber {
  
    static boolean isPrime(int n){
      if(n<=1)
      return false;
      
      if(n==2)
      return true;
      
      if(n>1 && n%2==0)
      return false;
      
      for(int i=3; i*i<=n; i+=2){
        if(n%i==0)
        return false;
      }
      return true;
    }
    public static void main(String[] args) {
      int n = 43;
      System.out.print(isPrime(n)?"Prime":"Not Prime"); 
  }
}
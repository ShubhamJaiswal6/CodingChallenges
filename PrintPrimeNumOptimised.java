import java.util.*;

public class PrintPrimeNumOptimised {
    public static void main(String[] args) {
      int n = 100;
      
      for(int i=2; i<=n; i++){
        boolean isPrime = true;
        
        if(i>2 && i%2==0){
          isPrime = false;
        }else{
          for(int j=3; j*j<=i; j+=2){
            if(i%j==0){
              isPrime = false;
              break;
            }
          }
        }
        
        if(isPrime){
          System.out.print(i+" ");
        }
      }
    }
}
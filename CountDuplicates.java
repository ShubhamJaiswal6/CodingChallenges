import java.util.*;

public class CountDuplicates {
  
  public static void countDuplicates(int[] array){
    for(int i=0; i<array.length; i++){
      
      //skip the processed elements
      if(array[i] == Integer.MIN_VALUE)
      continue;
      
      int count = 1;
      for(int j=i+1; j<array.length; j++){
        if(array[i] == array[j]){
          count++;
          
          //mark elements as processed
          array[j] = Integer.MIN_VALUE;
        }
      }
      
      if(count > 1){
        System.out.println("Element "+ array[i] + " is duplicated "+ (count-1) +" times.");
      }
      
    }
  }
    public static void main(String[] args) {
      
      int [] arr = {6,1,3,3,4,3,3};
      countDuplicates(arr);
  }
}
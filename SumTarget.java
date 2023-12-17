import java.util.*;

public class SumTarget {
  
    public static int[] sumIndices(int[] arr, int target){
      Map<Integer, Integer> numIndicesMap = new HashMap<>();
      
      for(int i=0; i<arr.length; i++){
        int complement = target - arr[i];
        
        if(numIndicesMap.containsKey(complement)){
          return new int[]{numIndicesMap.get(complement),i};
        }
        
        if(!numIndicesMap.containsKey(arr[i])){
          numIndicesMap.put(arr[i],i);
        }
      }
      return null;
    }
    public static void main(String[] args) {
      
      int [] nums = {2, 7, 11, 15};
      int target = 9;
      
      int [] result = sumIndices(nums, target);
      
      if(result!=null){
        System.out.printf("Two indices that sums upto %d are [%d, %d]%n", target, result[0], result[1]);
      }
      else{
        System.out.println("No such indices are found.");
      }
  }
}
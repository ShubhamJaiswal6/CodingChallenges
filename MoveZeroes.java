
/*
Given an integer array nums, move all O's to the end of it while maintaining the relative order of the non-zero elements. Note that you must do this in-place without making a copy of the array.
*/

import java.util.*;
public class MoveZeroes {
    
    public void moveZeroes(int [] nums){
        
        int non_zero_index = 0;
        
        for(int i = 0; i<nums.length; i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[non_zero_index];
                nums[non_zero_index] = temp;
                non_zero_index++;
            }
        }
    }
    
    public static void main(String[] args) {
        
        int[] nums = {0, 1, 0, 3, 12};
        
        MoveZeroes m = new MoveZeroes();
        m.moveZeroes(nums); 
        
        System.out.println(Arrays.toString(nums));
    }
}
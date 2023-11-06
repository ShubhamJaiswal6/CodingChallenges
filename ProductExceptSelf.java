/*
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
*/

import java.util.*;
public class ProductExceptSelf {
    
    public static int[] productExceptNumber(int[] num){
        
        int n = num.length;
        int prefix_prod =1;
        int suffix_prod =1;
        
        int [] result = new int [n];
        
        for(int i=0; i<n; i++){
            result[i]= prefix_prod;
            prefix_prod *= num[i];
        }
        
        for(int i=n-1; i>=0; i--){
            result[i]= suffix_prod;
            suffix_prod *= num[i];
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        
        int [] num = {1,2,3,4};
        
        int [] result = productExceptNumber(num);
        System.out.println(Arrays.toString(result));
    }
}
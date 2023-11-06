/*
You are given an array of prices where prices[i] is the price of a given stock on an ith day. You want to maximise your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
*/

import java.util.*;
public class MaxProfit{
    
    public static int maxProfit(int[] prices){
        int min_price = Integer.MAX_VALUE;
        int max_profit = 0;
        
        for (int price : prices){
            if(price < min_price){
                min_price = price;
            } else if(price - min_price > max_profit){
                max_profit = price - min_price;
            }
        }
        return max_profit;
    }
    
    public static void main(String[] args){
        int [] prices = {7, 1, 5, 3, 6, 4};
        
        int maximum_profit = maxProfit(prices);
        System.out.println("Maximum profit is: "+maximum_profit);
    }
}
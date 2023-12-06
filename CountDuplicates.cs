using System;

public class CountDuplicates
{
    public static void countDuplicates(int [] array){
        for(int i=0; i<array.Length; i++){
            if(array[i] == int.MinValue)
            continue;
            
            int count=1;
            
            for(int j=i+1; j<array.Length; j++){
                if(array[i] == array[j]){
                    count++;
                    array[j] = int.MinValue;
                }
            }
            
            if(count > 1){
                Console.WriteLine($"Element {array[i]} is duplicated {count-1} times.");
            }
        }
    }
    public static void Main(string[] args)
    {
        int [] arr = {6,1,3,3,4,3,3};
        countDuplicates(arr);
    }
}
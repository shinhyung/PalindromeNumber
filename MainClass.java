package Solution;

import java.io.*;
import java.util.*;

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int count=0;  
        ArrayList<Integer> numbers = new ArrayList<>();
       
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i]==1) {
               count++;
            }
            else{
                numbers.add(count);
                count=0;
            }
            
        }
        
        numbers.add(count);
        int max=numbers.get(0);
        
        for(int i=1;i<numbers.size();i++){
            if(numbers.get(i)>max){
                max = numbers.get(i);
            }
            else {
            
            }
        }  
        return max;
    }
    	
}
public class MainClass {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
          return new int[0];
        }
    
        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] nums = stringToIntegerArray(line);
            
            int ret = new Solution().findMaxConsecutiveOnes(nums);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
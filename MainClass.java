package Solution;

import java.io.*;
import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
    	ArrayList<Integer> list = new ArrayList<>();
    	
    	int i=0;
    	int j=0;
    	
       while(i<nums1.length&&j<nums2.length) {
    	  
    	   if(nums1[i] < nums2[j]) { 	
           	i++;
           	
           }
           else if(nums2[j]==nums1[i]) {
           	list.add(nums1[i]);
           	i++;
           	j++;
           }
           else {
           	j++;
           }
       }
        //두 배열에 표시된 횟수를 알아야 한다.
       
        int[] array = new int[list.size()];
        
        for(int f=0;f<array.length;f++) {
           array[f] = list.get(f).intValue();
        }
        return array;
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
    
    public static String integerArrayToString(int[] nums, int length) {
        if (length == 0) {
            return "[]";
        }
    
        String result = "";
        for(int index = 0; index < length; index++) {
            int number = nums[index];
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }
    
    public static String integerArrayToString(int[] nums) {
        return integerArrayToString(nums, nums.length);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] nums1 = stringToIntegerArray(line);
            line = in.readLine();
            int[] nums2 = stringToIntegerArray(line);
            
            int[] ret = new Solution().intersect(nums1, nums2);
            
            String out = integerArrayToString(ret);
            
            System.out.print(out);
        }
    }
}
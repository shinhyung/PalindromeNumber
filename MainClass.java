package Solution;

import java.io.*;
import java.util.*;

class Solution {
	    public List<Integer> selfDividingNumbers(int left, int right) {
	        
	    	//left¿Í right¹üÀ§ 
	    	ArrayList<Integer> list = new ArrayList<Integer>();
	    
	        int num;
	        int count=0;
	        String number;
	        String[] listnumber;
	        int index = left;
	   
	       
	        for(int j=0;j<=right-left;j++) {
	        	number = Integer.toString(index);
	        	listnumber = number.split("");
	        	
	        	for(int i=0;i<listnumber.length;i++) {
	        		num = Integer.parseInt(listnumber[i]);
	        		
	        		if(!number.contains("0") &&index%num==0) {
	        		 
	        			count++;
	        			
	        			if(count == listnumber.length) {
	        				list.add(index);
	        			
	        			}
	        		
	        		}
	        		
	        	}
	        	count=0;
	        	index++;
	        }
	        
	        
	        
	        
	        return list;
	    }
	   
	}

	public class MainClass {
	    public static String integerArrayListToString(List<Integer> nums, int length) {
	        if (length == 0) {
	            return "[]";
	        }
	    
	        String result = "";
	        for(int index = 0; index < length; index++) {
	            Integer number = nums.get(index);
	            result += Integer.toString(number) + ", ";
	        }
	        return "[" + result.substring(0, result.length() - 2) + "]";
	    }
	    
	    public static String integerArrayListToString(List<Integer> nums) {
	        return integerArrayListToString(nums, nums.size());
	    }
	    
	    public static void main(String[] args) throws IOException {
	        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	        String line;
	        while ((line = in.readLine()) != null) {
	            int left = Integer.parseInt(line);
	            line = in.readLine();
	            int right = Integer.parseInt(line);
	            
	            List<Integer> ret = new Solution().selfDividingNumbers(left, right);
	            
	            String out = integerArrayListToString(ret);
	            
	            System.out.print(out);
	        }
	    }
	}
package Solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
 
    public static boolean isHappy(int n) {
		
		    double result = 0;
	        String s = Integer.toString(n);
	        String _s[];
	        int[] number = new int[10];
	        double sum = 0;
	        int k=n;
	        int count=0;
	        
        
	         while( count != 10 ) { 
	    	  
	    	  s=Integer.toString(k);
	      
	    	 _s = s.split("");
	        
	      
	        for(int i=0;i<s.length();i++) { 
	        	_s[i] = _s[i].trim();
	        	
	        	number[i] =Integer.parseInt(_s[i]);
	        	
	     
	        }
    
	        sum=0;
       
	     
	        for(int j=0;j<s.length();j++) {
	        	result = Math.pow(number[j],2);
	        	sum += result; 
	        }

	        k=0;
	        k = (int) sum; 
	        System.out.print(" "+k+" ");
	     
	        count++;
	        
	       
	      }

	        
	        if( k == 1 ) {
	        	
	        	return true;
	        	
	        }
	        
	        else{
	        	return false;
	        	
	        } 	
	 
	        
	            
	       
     }
	        	

}

public class MainClass {
    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            
            boolean ret = new Solution().isHappy(n);
            
            String out = booleanToString(ret);
            
            System.out.print(out);
        }
    }
}
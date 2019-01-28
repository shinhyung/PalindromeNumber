package Solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;



class Solution {
	public boolean isPalindrome(int x) {
	    
		int count=1;
		ArrayList<Integer> listone = new ArrayList<Integer>();
		ArrayList<Integer> listtwo = new ArrayList<Integer>();
		String token = Integer.toString(x);
		String[] tokenlist = token.split("");
		
		
		
		if(x<0) {
			return false;
		}
		if(x<=9) {
			return true;
		}
		
		else {
			
						for(int j=0;j<tokenlist.length/2;j++) {
							int sum = Integer.parseInt(tokenlist[j]);
							listone.add(sum);
						}
						for(int j=tokenlist.length-1;j>=tokenlist.length/2;j--) {
							int sum = Integer.parseInt(tokenlist[j]);
							listtwo.add(sum);
						}
						count=0;
						for(int j=0;j<listone.size();j++) {
							if(listone.get(j).equals(listtwo.get(j))) {
								count++;
							}
						}
						if(count==listone.size()) {
							return true;
						}
						
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
            int x = Integer.parseInt(line);
            
            boolean ret = new Solution().isPalindrome(x);
            
            String out = booleanToString(ret);
            
            System.out.print(out);
        }
    }
}
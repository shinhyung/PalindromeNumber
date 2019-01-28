package Solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* -----------------------------------
 *  WARNING:
 * -----------------------------------
 *  Your code may fail to compile
 *  because it contains public class
 *  declarations.
 *  To fix this, please remove the
 *  "public" keyword from your class
 *  declarations.
 */


//Definition for singly-linked list.


class Solution {

	public boolean isPalindrome(ListNode head) {
	   
		ArrayList<Integer> list = new ArrayList<Integer>();
	    ArrayList<Integer> listtwo = new ArrayList<Integer>();
        ArrayList<Integer> listthree = new ArrayList<Integer>();

	    int count=1;
		
	    if(head==null) {
			return true;
		}
	    
	    while(head.next!=null) {
			list.add(head.val);
			head=head.next;
		}
	    list.add(head.val);
	    
	    for(int k=0;k<list.size();k++) {
	    	count++;
	    }
	    if(count==1) {
	    	return true;
	    }
	    else {
	    	
	                for(int j=0;j<list.size()/2;j++) {
	                   int sum = list.get(j);
	                   listtwo.add(sum);
	                }

	                for(int j=list.size()-1;j>=list.size()/2;j--) {
	                   int sum = list.get(j);
	                   listthree.add(sum);
	                }
	                count=0;
	                for(int j=0;j<listtwo.size();j++) {
	                   if(listtwo.get(j).equals(listthree.get(j))){
	                      count++;
	                   }
	                }
	                if(count==listtwo.size()) {
	                   return true;
	                }
	                return false;
	             }

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
    
    public static ListNode stringToListNode(String input) {
        // Generate array from the input
        int[] nodeValues = stringToIntegerArray(input);
    
        // Now convert that list into linked list
        ListNode dummyRoot = new ListNode(0);
        ListNode ptr = dummyRoot;
        for(int item : nodeValues) {
            ptr.next = new ListNode(item);
            ptr = ptr.next;
        }
        return dummyRoot.next;
    }
    
    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            ListNode head = stringToListNode(line);
            
            boolean ret = new Solution().isPalindrome(head);
            
            String out = booleanToString(ret);
            
            System.out.print(out);
        }
    }
}
package LeetCode.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class ConvertBinaryNumberInLinkedListToInteger {

	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		 }
		
	public int getDecimalValue(ListNode head) {
	        
	        ListNode temp = head;
	        
	        List<Integer> list = new ArrayList<>();
	        
	        while(temp!=null){
	            list.add(temp.val);
	            temp=temp.next;
	        }
	        
	        int base = 1;
	        int result = 0;
	        
	        for(int i=list.size()-1;i>=0;i--){
	            
	            result+=list.get(i)*base;
	            
	            base*=2;
	        }
	        
	        return result;
	        
	    }
}

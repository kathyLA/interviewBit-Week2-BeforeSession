/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode a) {
        
        if(a == null || a.next == null) {
            return a;
        }
        
        ListNode pt = a;
        
        while( pt != null && pt.next != null ) {
            int val = pt.val;
            int val2 = pt.next.val;
            if(val == val2) {
                pt.next = pt.next.next;
            } else {
                pt = pt. next;
            }
            
        }
        return a; 
    }
}

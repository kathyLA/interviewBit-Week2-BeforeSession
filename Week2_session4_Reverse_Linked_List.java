/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */

public class Solution {
    public ListNode reverseBetween(ListNode a, int m, int n) {
        ListNode headholder = new ListNode(0);
        headholder.next = a;
        ListNode reverselisthead = new ListNode(0);
        ListNode reverselisttail = new ListNode(0);
        int count = 1;
        ListNode prev = headholder, cur = a;
        while(count <=n){
            ListNode temp = cur.next;
            if (count < m)
                prev = cur;
            else if (count == m){
                reverselisttail = cur;
                reverselisthead.next = cur;
            }else if (count > m){
                cur.next = reverselisthead.next;
                reverselisthead.next = cur;
            }
            cur = temp;
            count++;
        }
        prev.next = reverselisthead.next;
        reverselisttail.next = cur;
        return 	headholder.next;
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head== null || left==right)
        return head;
      ListNode current=head;
      int l=left;
      ListNode dummy=new ListNode(-1);
      dummy.next=head;
      ListNode prevLeft=dummy;

      
      
      while(left!=1)
      {
        prevLeft=prevLeft.next;
        current=current.next;
        left--;
      }
      
      ListNode prev=null;
      ListNode next=null;
      ListNode duplicate=current;
       while(current!=null && right-l>=0)
       {
     next=current.next;
        current.next=prev;
        prev=current;
        current=next;
        
        
        right--;
       }
    
    
       
       duplicate.next=current;
       prevLeft.next=prev;
       return dummy.next;

        
        
        
    }
}
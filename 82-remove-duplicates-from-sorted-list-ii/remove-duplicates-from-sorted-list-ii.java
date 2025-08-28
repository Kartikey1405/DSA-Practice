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
    public ListNode deleteDuplicates(ListNode head) {
          ListNode current=head;
          ListNode dummy=new ListNode(-1);
          dummy.next=current;
          ListNode prev=dummy;
        while(current!=null && current.next!=null)
        {
            
            
            
           if(current.val==current.next.val)
           {ListNode temp=current;
        
            while(temp.next!=null && temp.val==temp.next.val)
            {
                temp=temp.next;
            }
            prev.next=temp.next;
            current=temp.next;
          
            
           }
           else{
            prev=prev.next;
              current=current.next;
                 

           
        

           }
           
           
            
        }
        return dummy.next;
        
    }
}
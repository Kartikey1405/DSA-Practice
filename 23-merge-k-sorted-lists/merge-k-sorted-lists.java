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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)
        return null;
        ListNode head=null;

        for(int i=0;i<lists.length;i++)
        {
            ListNode current=lists[i];
            head=mergeList(head,current);

            

        }
        return head;
    }
    ListNode mergeList(ListNode l1,ListNode l2)
    {
      
        ListNode head=new ListNode(-1);
        ListNode dummy=head;
        while(l1!=null && l2!=null)
        {
            if(l1.val<=l2.val)
            {
                dummy.next=l1;
                l1=l1.next;
                

            }
            else
            {
                dummy.next=l2;
                l2=l2.next;

            }
            dummy=dummy.next;
        }
       if(l1!=null)
     dummy.next=l1;
        if(l2!=null)
       dummy.next=l2;
        return head.next;
    }
}
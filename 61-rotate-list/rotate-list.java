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
    public ListNode rotateRight(ListNode head, int k) {
         if(head==null)
        return head;
        ListNode lastNode=head;
        int length=1;
        while(lastNode.next!=null)
        {
            length++;
            lastNode=lastNode.next;
        }
      
        if(head==null || k%length==0)
        return head;
        int pos=length-k%length;
        ListNode newLast=getNode(head,pos);
          lastNode.next=head;
        ListNode newHead=newLast.next;
        newLast.next=null;
        return newHead;

    }
    ListNode getNode(ListNode head,int pos)
    {
        pos--;
        ListNode current=head;
        while(current!=null && pos!=0)
        {
            current=current.next;
            pos--;

        }
        return current;
    }
}
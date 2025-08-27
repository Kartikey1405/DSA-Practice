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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode arr[]=new ListNode[k];
        int length=getLength(head);
        int nodes=length/k;
        int remainingNodes=length%k;
        ListNode current=head;
        for(int i=0;i<k;i++)
        {
            if(current==null)
            {
            arr[i]=null;
            continue;
        }
        int partSize=nodes;
        if(remainingNodes>0)
        {
            partSize++;
            remainingNodes--;
        }
        arr[i]=current;
        partSize--;
        while(partSize!=0)
        {
            current=current.next;
            partSize--;
        }
        
        ListNode newNode=current.next;
        current.next=null;
        current=newNode;
            


        }
        return arr;
       
       
    }
    int getLength(ListNode head)
    {
       
        int length=0;
        ListNode current=head;
        while(current!=null)
        {
            current=current.next;
            length++;
        }
        return length;
    }
   
}
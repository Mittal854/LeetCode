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
    public ListNode reverse(ListNode head)
    {
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=head;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public int getDecimalValue(ListNode head) {
        head=reverse(head);
        int dec=0;
        int i=0;
        while(head!=null)
        {
            dec+=head.val*Math.pow(2,i);
            i++;
            head=head.next;
        }
        return dec;
    }
}
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
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null)
        {
            slow=slow.next;
            fast=fast.next;
            if(fast!=null) fast=fast.next;
        }
        ListNode half=reverse(slow);
        ListNode temp=head;
        while(half!=null)
        {
            ListNode temp1=temp.next;
            ListNode temp2=half.next;
            temp.next=half;
            half.next=temp1;
            half=temp2;
            temp=temp1;
        }
        temp.next=null;

    }
}
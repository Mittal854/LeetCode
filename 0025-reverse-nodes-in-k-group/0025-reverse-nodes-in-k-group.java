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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null) return null;
        int countNodes=0;
        ListNode temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            countNodes++;
        }
        if(countNodes<k) return head;
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=head;
        int count=0;
        while(curr!=null && count<k)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }
        if(curr!=null)
        {
            head.next=reverseKGroup(curr,k);
        }
        return prev;
    }
}
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
            countNodes++;
            temp=temp.next;
        }
        if(countNodes<k) return head;
        int count=0;
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=head;
        while(curr!=null && count<k)
        {
            curr=next;
            next=curr.next;
            curr.next=prev;
            prev=curr;
            count++;
        }
        if(next!=null)
        {
            head.next=reverseKGroup(next,k);
        }
        return prev;
    }
}
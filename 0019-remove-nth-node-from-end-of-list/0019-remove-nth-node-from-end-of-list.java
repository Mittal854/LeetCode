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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null)
        {
            if(n==1) return null;
            return head;
        }
        int total=0;
        ListNode temp=head;
        while(temp!=null)
        {
            total++;
            temp=temp.next;
        }
        n=total-n;
        if(n==0) return head.next;
        int currC=0;
        temp=head;
        while(temp!=null)
        {
            currC++;
            if(currC==n) break;
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}
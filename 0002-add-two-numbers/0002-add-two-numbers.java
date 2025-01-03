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
    public ListNode addTwoNumbers(ListNode t1, ListNode t2) {
        int sum=0;
        int carry=0;
        ListNode curr=new ListNode(-1);
        ListNode head=curr;
        while(t1!=null ||t2!=null)
        {
            if(t1!=null) sum+=t1.val;
            if(t2!=null) sum+=t2.val;
            sum+=carry;
            carry=sum/10;
            sum=sum%10;
            curr.next=new ListNode(sum);
            sum=0;
            if(t1!=null) t1=t1.next;
            if(t2!=null) t2=t2.next;
            curr=curr.next;
        }
        if(carry!=0)
        {
            curr.next=new ListNode(carry);
        }
        return head.next;

    }
}
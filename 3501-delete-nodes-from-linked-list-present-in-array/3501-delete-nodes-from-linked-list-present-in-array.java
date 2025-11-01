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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode newHead=new ListNode(-1);
        ListNode prev=newHead;
        ListNode curr=head;
        HashSet<Integer> numss=new HashSet<>();
        for(int i:nums) numss.add(i);
        while(curr!=null)
        {
            if(!numss.contains(curr.val))
            {
                prev.next=curr;
                prev=curr;
                
            }
            if(numss.contains(curr.val)) prev.next=null;
            curr=curr.next;
        }
        return newHead.next;
    }
}
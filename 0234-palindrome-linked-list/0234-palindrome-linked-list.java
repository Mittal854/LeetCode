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
    public boolean isPalindrome(ListNode head) {
        if(head.next==null) return true;
        String val="";
        ListNode temp=head;
        while(temp!=null)
        {
            val=val+temp.val;
            temp=temp.next;
        }
        int low=0;
        int high=val.length()-1;
        while(low<high)
        {
            if(val.charAt(low)!=val.charAt(high)) return false;
            low++;
            high--;
        }
        return true;
    }
}
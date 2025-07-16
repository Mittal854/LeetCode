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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp=list1;
        for(int i=0;i<a-1;i++)
        {
            temp=temp.next;
        }
        ListNode pos1=temp;
        for(int i=a-1;i<b;i++) temp=temp.next;
        ListNode end2=list2;
        while(end2.next!=null) end2=end2.next;
        pos1.next=list2;
        end2.next=temp.next;
        return list1;
    }
}
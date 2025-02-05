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
    public int pairSum(ListNode head) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=0;
        while(head!=null)
        {
            map.put(n++,head.val);
            head=head.next;
        }
        int maxS=Integer.MIN_VALUE;
        for(int i=0;i<n/2;i++)
        {
            maxS=Math.max(maxS,map.get(i)+map.get(n-i-1));
        }
        return maxS;
    }
}
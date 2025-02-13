class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long>pq=new PriorityQueue<>();
        for(int num:nums)
        {
            pq.add((long)num);
        }
        int count=0;
        while(pq.size()>=2)
        {
            if(pq.peek()>=k) break;
            long a=pq.poll();
            long b=pq.poll();
            long val=(long)(Math.min(a,b)*2)+Math.max(a,b);
            pq.add(val);
            count++;
        }
        return count;
    }
}
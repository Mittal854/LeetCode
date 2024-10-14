class Solution {
    public long maxKelements(int[] nums, int k) {
        long sum=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++)
        {
            pq.add(nums[i]);
        }
        for(int i=0;i<k;i++)
        {
            int no=pq.poll();
            sum+=no;
            pq.add((int)(Math.ceil(no/3.0)));
        }
        return sum;
        
    }
}
class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer>heap=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:gifts)
        {
            heap.add(i);
        }
        for(int i=0;i<k;i++)
        {
            int x=heap.poll();
            heap.add((int)Math.sqrt(x));
        }
        long sum=0;
        for(int i:heap)
        {
            sum+=i;
        }
        return sum;

    }

}
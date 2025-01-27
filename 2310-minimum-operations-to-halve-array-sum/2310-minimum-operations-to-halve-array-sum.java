class Solution {
    public int halveArray(int[] nums) {
        double totalSum=0;
        PriorityQueue<Double>pq=new PriorityQueue<>((a,b)->Double.compare(b,a));
        for(int i:nums)
        {
            totalSum+=i;
            pq.add((double)i);
        }
        double reducedSum=0.0;
        int count=0;
        while(reducedSum<((double)totalSum/2))
        {
            double val=pq.poll();
            reducedSum+=(double)val/2;
            pq.add((double)(val/2));
            count++;

        }
        return count;
        
    }
}
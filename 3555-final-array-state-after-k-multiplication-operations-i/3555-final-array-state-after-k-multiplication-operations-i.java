class Pair{
    int value;
    int index;
    Pair(int value,int index)
    {
        this.value=value;
        this.index=index;
    }
}

class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.value!=b.value?Integer.compare(a.value,b.value):Integer.compare(a.index,b.index));
        for(int i=0;i<nums.length;i++)
        {
            pq.add(new Pair(nums[i],i));
        }
        for(int i=0;i<k;i++)
        {
            Pair p=pq.poll();
            int value=p.value;
            int index=p.index;
            value=value*multiplier;
            pq.add(new Pair(value,index));
        }
        while(!pq.isEmpty())
        {
            Pair p=pq.poll();
            int value=p.value;
            int index=p.index;
            nums[index]=value;
        }
        return nums;
    }
}
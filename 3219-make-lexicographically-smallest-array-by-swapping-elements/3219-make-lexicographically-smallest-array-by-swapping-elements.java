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
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n=nums.length;
        Pair[] pairs=new Pair[n];
        for(int i=0;i<n;i++)
        {
            pairs[i]=new Pair(nums[i],i);
        }
        Arrays.sort(pairs,(a,b)->Integer.compare(a.value,b.value));
        int left=0;
        int right=1;
        while(right<n)
        {
            List<Integer>pos=new ArrayList<>();
            pos.add(pairs[left].index);
            while(right<n &&(pairs[right].value-pairs[right-1].value<=limit))
            {
                pos.add(pairs[right].index);
                right++;
            }
            Collections.sort(pos);
            for(int i=0;i<right-left;i++)
            {
                nums[pos.get(i)]=pairs[left+i].value;
            }
            left=right;
            right=right+1;
        }
        return nums;

    }
}
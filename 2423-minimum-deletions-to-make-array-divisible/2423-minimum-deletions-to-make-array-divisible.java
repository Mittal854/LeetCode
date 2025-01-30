class Solution {

    public int hcf(int a,int b)
    {
        if(b==0) return a;
        return hcf(b,a%b);
    }

    public int hcfArray(int[]numsDivide)
    {
        int hcf=numsDivide[0];
        for(int i=1;i<numsDivide.length;i++)
        {
            hcf=hcf(hcf,numsDivide[i]);
        }
        return hcf;
    }

    public int minOperations(int[] nums, int[] numsDivide) {
        HashMap<Integer,Integer>map=new HashMap<>();
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.get(i)<2) pq.add(i);
        }
        int hcf=hcfArray(numsDivide);
        if(hcf<pq.peek()) return -1;
        int del=0;
        while(!pq.isEmpty())
        {
            int p=pq.poll();
            if(hcf%p==0){
                return del;
            };
            del+=map.get(p);
        }
        return -1;
    }
}
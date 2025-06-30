class Pair{
    int cap;
    int curr;
    Pair(int cap,int curr)
    {
        this.cap=cap;
        this.curr=curr;
    }
}

class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n=capacity.length;
        Pair[] p=new Pair[n];
        for(int i=0;i<n;i++)
        {
            p[i]=new Pair(capacity[i],rocks[i]);
        }
        Arrays.sort(p,(a,b)->Integer.compare(a.cap-a.curr,b.cap-b.curr));
        int count=0;
        int i=0;
        while(additionalRocks>0 && i<n)
        {
            additionalRocks-=p[i].cap-p[i].curr;
            if(additionalRocks>=0)count++;
            i++;
        }
        return count;
    }
}
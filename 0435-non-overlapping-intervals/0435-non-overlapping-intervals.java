class Pair{
    int start;
    int end;
    Pair(int start,int end)
    {
        this.start=start;
        this.end=end;
    }
}

class Solution {
    public int eraseOverlapIntervals(int[][] interval) {
        int n=interval.length;
        Pair[]pairs=new Pair[n];
        for(int i=0;i<n;i++)
        {
            pairs[i]=new Pair(interval[i][0],interval[i][1]);
        }
        Arrays.sort(pairs,(a,b)->Integer.compare(a.end,b.end));
        int count=0;
        int prev=Integer.MIN_VALUE;
        for(Pair i:pairs)
        {
            if(i.start>=prev)
            {
                count++;
                prev=i.end;
            }
        }
        return n-count;
    }
}
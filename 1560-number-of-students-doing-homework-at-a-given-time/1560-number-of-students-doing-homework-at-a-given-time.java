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
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int n=startTime.length;
        Pair[] pairs=new Pair[n];
        for(int i=0;i<n;i++)
        {
            pairs[i]=new Pair(startTime[i],endTime[i]);
        }
        Arrays.sort(pairs,(a,b)->Integer.compare(a.start,b.start));
        int count=0;
        for(Pair p:pairs)
        {
            if(p.start<=queryTime && p.end>=queryTime) count++;
            else if(p.start>queryTime) break;
        }
        return count;
    }
}
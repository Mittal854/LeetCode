class Solution {
    public int maxTwoEvents(int[][] events) {
        Arrays.sort(events,(a,b)-> Integer.compare(a[0],b[0]));
        int n=events.length;
        int[] maxV=new int[n];
        maxV[n-1]=events[n-1][2];
        for(int i=n-2;i>=0;i--)
        {
            maxV[i]=Math.max(events[i][2],maxV[i+1]);
        }
        int maxS=0;
        for(int i=0;i<n;i++)
        {
            maxS=Math.max(maxS,events[i][2]);
            int next=index(events,i);
            if(next!=-1)
            {
                maxS=Math.max(maxS,events[i][2]+maxV[next]);
            }
        }
        return maxS;
    }
    private int index(int[][]events,int curr)
    {
        int low=curr+1;
        int high=events.length-1;
        int target=events[curr][1]+1;
        int result=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(events[mid][0]>=target)
            {
                high=mid-1;
                result=mid;
            }
            else
            {
                low=mid+1;
            }
        }
        return result;
    }
}
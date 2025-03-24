class Solution {
    public int countDays(int days, int[][] meetings) {
        int n=meetings.length;
        int i=0;
        ArrayList<int[]>merged=new ArrayList<>();
        Arrays.sort(meetings,(a,b)->Integer.compare(a[0],b[0]));
        while(i<n)
        {
            int start=meetings[i][0];
            int end=meetings[i][1];
            while(i<n && end>=meetings[i][0])
            {
                start=Math.min(start,meetings[i][0]);
                end=Math.max(end,meetings[i][1]);
                i++;
            }
            merged.add(new int[]{start,end});
        }
        int ans=0;
        int prevend=1;
        for(i=0;i<merged.size();i++)
        {
            int start=merged.get(i)[0];
            int end=merged.get(i)[1];
            ans+=start-prevend;
            prevend=end+1;
        }
        ans+=Math.max(0,days-prevend+1);
        return ans;
    }
}
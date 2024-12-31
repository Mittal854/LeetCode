class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]>ans=new ArrayList<>();
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int i=0;
        int n=intervals.length;
        while(i<n)
        {
            int start=intervals[i][0];
            int end=intervals[i][1];
            while(i<n && end>=intervals[i][0])
            {
                start=Math.min(intervals[i][0],start);
                end=Math.max(intervals[i][1],end);
                i++;
            }
            ans.add(new int[]{start,end});
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
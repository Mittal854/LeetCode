class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]>inter=new ArrayList<>();
        int i=0;
        while(i<intervals.length &&intervals[i][1]<newInterval[0])
        {
            inter.add(intervals[i]);
            i++;
        }
        int start=newInterval[0];
        int end=newInterval[1];
        while(i<intervals.length &&end>=intervals[i][0])
        {
            start=Math.min(intervals[i][0],start);
            end=Math.max(intervals[i][1],end);
            i++;
        }
        inter.add(new int[]{start,end});
        while(i<intervals.length)
        {
            inter.add(intervals[i]);
            i++;
        }
        return inter.toArray(new int[inter.size()][]);

    }
}
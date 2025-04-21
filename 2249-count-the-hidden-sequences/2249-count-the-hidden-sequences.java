class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        long min=0;
        long max=0;
        long curr=0;
        for(int num:differences)
        {
            curr+=num;
            min=Math.min(min,curr);
            max=Math.max(max,curr);
        }
        int diff=(int)(max-min);
        int ans=upper-lower-diff+1;
        return ans>=0?ans:0;
    }
}
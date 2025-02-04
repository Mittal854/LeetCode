class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int[] prefix=new int[n+1];
        int highest=0;
        for(int i=0;i<n;i++)
        {
            prefix[i+1]=prefix[i]+gain[i];
            highest=Math.max(highest,prefix[i+1]);
        }
        return highest;
    }
}
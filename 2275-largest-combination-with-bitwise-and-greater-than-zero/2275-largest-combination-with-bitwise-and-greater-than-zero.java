class Solution {
    public int largestCombination(int[] candidates) {
        int[] bits=new int[32];
        for(int i=0;i<candidates.length;i++)
        {
            for(int j=0;j<32;j++)
            {
                if((candidates[i]&(1<<j))!=0) bits[j]++;
            }
        }
        int ans=Integer.MIN_VALUE;
        for(int i:bits)
        {
            ans=Math.max(i,ans);
        }
        return ans;
    }
}
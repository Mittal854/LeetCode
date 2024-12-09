class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n=nums.length;
        boolean[] isA=new boolean[n];
        int[] pre=new int[n];
        boolean[] ans=new boolean[queries.length];
        for(int i=1;i<n;i++)
        {
            isA[i]=nums[i]%2!=nums[i-1]%2;
            pre[i]=pre[i-1]+(isA[i]?1:0);
        }
        for(int i=0;i<queries.length;i++)
        {
            int a=queries[i][0];
            int b=queries[i][1];
            if(a==b) ans[i]=true;
            else
            {
                ans[i]=pre[b]-pre[a]==b-a;
            }
        }
        return ans;
    }
}
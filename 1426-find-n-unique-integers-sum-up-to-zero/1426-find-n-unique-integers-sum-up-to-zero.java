class Solution {
    public int[] sumZero(int n) {
        int[] ans=new int[n];
        int mid=n/2;
        // boolean isodd=n%2!=0;
        int i=0;
        while(i+2<=n)
        {
            ans[i++]=-mid;
            ans[i++]=mid;
            mid--;
        }
        return ans;
    }

}
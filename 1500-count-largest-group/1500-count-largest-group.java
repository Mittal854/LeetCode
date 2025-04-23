class Solution {
    public int countLargestGroup(int n) {
        int[] counts=new int[40];
        int ans=0;
        int mx=0;
        for(int i=1;i<=n;i++)
        {
            int s=0;
            for(int j=i;j>0;j=j/10)
            {
                s+=j%10;
            }
            ++counts[s];
            if(counts[s]>mx)
            {
                mx=counts[s];
                ans=1;
            }
            else if(counts[s]==mx) ans++;
        }
        return ans;
    }
}
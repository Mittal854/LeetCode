class Solution {
    public int maximumCandies(int[] candies, long k) {
        int maxi=Integer.MIN_VALUE;
        int mini=1;
        for(int candy:candies)
        {
            maxi=Math.max(maxi,candy);
        }
        if(!helper(candies,k,mini)) return 0;
        while(mini<=maxi)
        {
            int mid=mini+(maxi-mini)/2;
            if(helper(candies,k,mid))
            {
                mini=mid+1;
            }
            else
            {
                maxi=mid-1;
            }
        }
        return maxi;

    }
    public boolean helper(int[] candies, long k,int candy)
    {
        long total=0;
        for(int num:candies)
        {
            total+=num/candy;
        }
        return total>=k;
    }
}
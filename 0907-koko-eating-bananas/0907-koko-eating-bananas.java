class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int b:piles)
        {
            max=Math.max(max,b);
        }
        int left=1;
        int right=max;
        while(left<right)
        {
            int mid=left+(right-left)/2;
            if(isSpeed(piles,h,mid))
            {
                right=mid;
            }
            else
            {
                left=mid+1;
            }
        }
        return left;
    }
    public boolean isSpeed(int[] piles,int h, int speed)
    {
        int ho=0;
        for(int b:piles)
        {
            ho+=(b+speed-1)/speed;
        }
        return ho<=h;
    }
}
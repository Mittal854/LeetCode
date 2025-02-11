class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n=spells.length;
        int m=potions.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++)
        {
            int no=spells[i];
            int low=0;
            int high=m-1;
            while(low<=high)
            {
                int mid=low+(high-low)/2;
                if((long)no*potions[mid]>=success)
                {
                    high=mid-1;
                }
                else
                {
                    low=mid+1;
                }
            }
            ans[i]=m-low;
        }
        return ans;
    }
}
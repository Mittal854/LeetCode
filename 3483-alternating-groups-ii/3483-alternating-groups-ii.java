class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n=colors.length;
        int count=0;
        int left=0;
        for(int i=0;i<n+k-1;i++)
        {
            if(i>0 && colors[i%n]==colors[(i-1)%n])
            {
                left=i;
            }
            if(i-left+1>=k) count++;
        }
        return count;
    }
}
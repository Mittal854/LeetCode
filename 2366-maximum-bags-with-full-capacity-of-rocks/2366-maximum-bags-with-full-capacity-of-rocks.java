class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n= capacity.length;
        int[] rem=new int[n];
        for(int i=0;i<n;i++)
        {
            rem[i]=capacity[i]-rocks[i];
        }
        Arrays.sort(rem);
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(additionalRocks>=rem[i])
            {
                count++;
                additionalRocks-=rem[i];
            }
            else break;
        }
        return count;
    }
}
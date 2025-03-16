class Solution {
    public long repairCars(int[] ranks, int cars) {
        long left=1;
        long right=(long) Arrays.stream(ranks).min().getAsInt()*(long)cars*cars;
        while(left<right)
        {
            long mid=left+(right-left)/2;
            if(helper(ranks,cars,mid))
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
    public boolean helper(int[] ranks,int cars,long mid)
{
    long total=0;
    for(int rank:ranks)
    {
        total+=(long)Math.sqrt((double)mid/rank);
        if(total>=cars) return true;
    }
    return false;
}
}

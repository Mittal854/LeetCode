class Solution {
    public int numOfSubarrays(int[] arr) {
        int prefix_Sum=0;
        int even_count=1;
        int odd_count=0;
        int total=0;
        int mod=1_000_000_007;
        for(int num:arr)
        {
            prefix_Sum+=num;
            if(prefix_Sum%2!=0)
            {
                total=(total+even_count)%mod;
                odd_count++;
            }
            else
            {
                total=(total+odd_count)%mod;
                even_count++;
            }
        }
        return total;
    }
}
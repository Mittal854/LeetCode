class Solution {
    public boolean divideArray(int[] nums) {
        int[] freq=new int[501];
        for(int num:nums)
        {
            freq[num]++;
        }
        for(int fre:freq)
        {
            if(fre==0) continue;
            if(fre%2!=0) return false;
        }
        return true;
    }
}
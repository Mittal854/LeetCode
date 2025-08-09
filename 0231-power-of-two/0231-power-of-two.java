class Solution {
    public boolean isPowerOfTwo(int n) {
        int set=0;
        while(n>0)
        {
            set+=(n)&1;
            n=n>>1;

        }
        return set==1;
    }
}
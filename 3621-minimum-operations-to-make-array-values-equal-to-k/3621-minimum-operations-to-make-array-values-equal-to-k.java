class Solution {
    public int minOperations(int[] nums, int k) {
        boolean[] contained=new boolean[101];
        for(int num:nums)
        {
            if(num<k) return -1;
            contained[num]=true;
        }
        int op=0;
        for(int i=k+1;i<101;i++)
        {
            if(contained[i]) op++;
        }
        return op;
    }
}
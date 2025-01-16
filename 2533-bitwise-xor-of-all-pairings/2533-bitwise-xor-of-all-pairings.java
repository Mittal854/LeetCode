class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int ans=0;
        n=n%2;
        m=m%2;
        for(int num:nums1)
        {
            ans=ans^(num*m);
        }
        for(int num:nums2)
        {
            ans^=(num*n);
        }
        return ans;
    }
}
class Solution {
    public int longestSubarray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i : nums) {
            max = Math.max(i, max);
        }
        int len = 0;
        int maxL = 0;
        for (int i : nums) {
            if (i == max) {
                len++;
            } else {
                maxL = Math.max(maxL, len);
                len = 0;
            }
        }
        return Math.max(maxL,len);
    }
}
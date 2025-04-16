class Solution {
    public long countGood(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        int right = 0;
        long good_pairs = 0;
        long equal_pairs = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (left < n) {
            while(right<n && equal_pairs<k)
            {
                map.put(nums[right],map.getOrDefault(nums[right],0)+1);
                if(map.get(nums[right])>=2) equal_pairs+=map.get(nums[right])-1;
                right++;
            }
            if(equal_pairs>=k)
            {
                good_pairs+=n-right+1;
            }

            map.put(nums[left],map.get(nums[left])-1);
            if(map.get(nums[left])>0) equal_pairs-=map.get(nums[left]);
            left++;

        }
        return good_pairs;
    }
}
class Solution {

    public List<Integer> largestDivisibleSubset(int[] nums) {

        List<Integer> list = new ArrayList<>();

        int[] arr = new int[nums.length];

        int[] dp = new int[nums.length];

        Arrays.fill(dp, 1);        Arrays.sort(nums);


        int max=0;
        int lastIndex=0;

        for (int i = 0; i < nums.length; i++) {
            arr[i]=i;
              for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                    arr[i] = j;
                }
            }
            if(max<dp[i]){
                max=dp[i];
                lastIndex=i;
            }
        }


        while (arr[lastIndex]!=lastIndex){
            
             list.add(nums[lastIndex]);
            lastIndex=arr[lastIndex];
        }
                    list.add(nums[lastIndex]);


        Collections.reverse(list);
        return list;
    }
}
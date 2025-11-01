class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans=new int[2];
        int low=0;
        int high=numbers.length-1;
        while(low<high)
        {
            int sum=numbers[low]+numbers[high];
            if(sum<target) low++;
            else if(sum>target) high--;
            else {
                ans[0]=++low;
                ans[1]=++high;
                break;
            }
        }
        return ans;
    }
}
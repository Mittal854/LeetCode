class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>ans=new ArrayList<Integer>();
        Arrays.sort(nums);
        int count=0;
        int n=nums.length;
        int currVal=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==currVal)
            {
                count++;
            }
            else if(nums[i]!=currVal)
            {
                if(count>(n/3))
                {
                    ans.add(currVal);
                    
                }
                currVal=nums[i];
                count=1;
            }
        }
        if(count>(n/3)) ans.add(currVal);
        return ans;
    }
}
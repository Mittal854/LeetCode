class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                map.put(nums[i]*nums[j],map.getOrDefault(nums[i]*nums[j],0)+1);
            }
        }
        int count=0;
        for(var entry:map.entrySet())
        {
            if(entry.getValue()>1)
            {
                count+=8*((entry.getValue()*(entry.getValue()-1))/2);
            }
        }
        return count;
    }
}
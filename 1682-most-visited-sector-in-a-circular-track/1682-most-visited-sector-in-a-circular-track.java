class Solution {
    public List<Integer> mostVisited(int n, int[] nums) {
        int[] counts=new int[n+1];
        counts[nums[0]]++;
        for(int i=1;i<nums.length;i++)
        {
            int start=nums[i-1];
            int end=nums[i];
            while(start!=end)
            {
                start=start%n+1;
                counts[start]++;
            }
        }
        List<Integer>ans=new ArrayList<>();
        int max=Arrays.stream(counts).max().getAsInt();
        for(int i=1;i<=n;i++)
        {
            if(counts[i]==max) ans.add(i);
        }
        return ans;
    }
}
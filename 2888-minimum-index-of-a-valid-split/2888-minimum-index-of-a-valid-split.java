class Solution {
    public int minimumIndex(List<Integer> nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=nums.size();
        int x=0;
        int f=0;
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.get(i)>n/2)
            {
                x=i;
                f=map.get(i);
            }
        }
        int ff=0;
        for(int i=0;i<n-1;i++)
        {
            if(nums.get(i)==x) ff++;
            int fff=f-ff;
            int size1=i+1;
            int size2=n-i-1;
            if(ff>size1/2 && fff>size2/2) return i;
        }
        return -1;
    }
}
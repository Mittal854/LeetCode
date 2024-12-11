class Solution {
    public int maximumBeauty(int[] nums, int k) {
        List<int[]> res=new ArrayList<>();
        for(int n:nums)
        {
            res.add(new int[]{n-k,1});
            res.add(new int[]{n+k+1,-1});
        }
        Collections.sort(res,(a,b)->{
            if(a[0]!=b[0])
            {
                return Integer.compare(a[0],b[0]);
            }
            else
            {
                return Integer.compare(a[1],b[1]);
            }
        });
        int maxC=0;
        int curr=0;
        for(int[] e:res)
        {
            curr+=e[1];
            maxC=Math.max(maxC,curr);
        }
        return Math.max(maxC,1);
    }
}
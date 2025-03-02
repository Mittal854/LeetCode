class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int[] num:nums1)
        {
            map.put(num[0],map.getOrDefault(num[0],0)+num[1]);
        }
        for(int[] num:nums2)
        {
            map.put(num[0],map.getOrDefault(num[0],0)+num[1]);
        }
        int n=map.size();
        int[][] ans=new int[n][2];
        int i=0;
        for(var entry:map.entrySet())
        {
            ans[i][0]=entry.getKey();
            ans[i][1]=entry.getValue();
            i++;
        }
        Arrays.sort(ans,(a,b)->Integer.compare(a[0],b[0]));
        return ans;
    }
}
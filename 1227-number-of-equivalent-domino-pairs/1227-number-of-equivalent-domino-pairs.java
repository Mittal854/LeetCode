class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        HashMap<String,Integer> map=new HashMap<>();
        for(int[] s:dominoes)
        {
            
            String a=s[0]>s[1]?s[1]+""+s[0]:s[0]+""+s[1];
            map.put(a,map.getOrDefault(a,0)+1);
        }
        int ans=0;
        for(int v:map.values())
        {
            ans+=v*(v-1)/2;
        }
        return ans;
    }
}
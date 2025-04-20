class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int ans=0;
        for(int num:answers)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int y:map.keySet())
        {
            int x=map.get(y);
            int groupsize=y+1;
            int groups=(x+groupsize-1)/groupsize;
            ans+=groupsize*groups;
        }
        return ans;
    }
}
class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        int n=queries.length;
        int[] ans=new int[n];
        HashMap<Integer,Integer>map=new HashMap<>();
        HashMap<Integer,ArrayList<Integer>>colors=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int x=queries[i][0];
            int y=queries[i][1];
            if(map.containsKey(x))
            {
                colors.get(map.get(x)).remove(Integer.valueOf(x));
                if(colors.get(map.get(x)).size()==0)
                {
                    colors.remove(map.get(x));
                }
            }
            colors.putIfAbsent(y,new ArrayList<>());
            map.put(x,y);
            colors.get(y).add(x);
            ans[i]=colors.size();
        }
        return ans;
    }
}
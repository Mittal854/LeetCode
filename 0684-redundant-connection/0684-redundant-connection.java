class Solution {

    public int find(int[]dsu,int v)
    {
        if(dsu[v]==-1)
        {
            return v;
        }
        return find(dsu,dsu[v]);
    }

    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;
        int[] dsu=new int[n+1];
        Arrays.fill(dsu,-1);
        for(int[]edge:edges)
        {
            int p_1=find(dsu,edge[0]);
            int p_2=find(dsu,edge[1]);
            if(p_1==p_2) return edge;
            else{
                dsu[p_1]=p_2;
            }
        }
        return new int[]{0,0};
    }
}
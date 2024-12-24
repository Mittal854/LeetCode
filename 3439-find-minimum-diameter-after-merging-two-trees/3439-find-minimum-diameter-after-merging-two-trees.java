class Solution {

    private int[] farf(Map<Integer,List<Integer>> graph,int start)
    {
        int n=graph.size();
        boolean[] visited=new boolean[n];
        Queue<Integer>q=new LinkedList<>();
        int[] dist=new int[n];
        q.add(start);
        visited[start]=true;
        int far=start;
        int maxD=0;
        while(!q.isEmpty())
        {
            int node=q.poll();
            for(int i:graph.get(node))
            {
                if(!visited[i])
                {
                    visited[i]=true;
                    dist[i]=dist[node]+1;
                    q.add(i);
                    if(dist[i]>maxD)
                    {
                        maxD=dist[i];
                        far=i;
                    }
                }
            }
        }
        return new int[]{far,maxD};
    }

    private int find(int[][] edges,int n)
    {
        Map<Integer,List<Integer>>graph=new HashMap<>();
        for(int i=0;i<n;i++) graph.put(i,new ArrayList<>());
        for(int[] edge:edges)
        {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        int[] far=farf(graph,0);
        int[] result=farf(graph,far[0]);
        return result[1];
    }

    public int minimumDiameterAfterMerge(int[][] edges1, int[][] edges2) {
        int m=edges1.length;
        int n=edges2.length;
        int dia1=find(edges1,m+1);
        int dia2=find(edges2,n+1);
        int radius1=((dia1+1)/2);
        int radius2=((dia2+1)/2);
        int sum=1+radius1+radius2;
        return Math.max(dia1,Math.max(dia2,sum));
    }
}
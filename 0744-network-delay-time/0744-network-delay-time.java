class Pair{
    int node;
    int wt;
    Pair(int node,int wt)
    {
        this.node=node;
        this.wt=wt;
    }
}

class Solution {

    public void topo(int node,boolean[] visited,Stack<Integer>st,ArrayList<ArrayList<Pair>>adj)
    {
        visited[node]=true;
        for(Pair i:adj.get(node))
        {
            if(!visited[i.node])
            {
                topo(i.node,visited,st,adj);
            }
        }
        st.add(node);
    }

    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<ArrayList<Pair>>adj=new ArrayList<>();
        for(int i=0;i<n+1;i++)
        {
            adj.add(new ArrayList<Pair>());
        }
        for(int[] arr:times)
        {
            adj.get(arr[0]).add(new Pair(arr[1],arr[2]));
        }
        
        int[]dist=new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k]=0;
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->Integer.compare(a.wt,b.wt));
        pq.add(new Pair(k,0));
        while(!pq.isEmpty())
        {
            Pair a=pq.poll();
            for(Pair p:adj.get(a.node))
            {
                if(dist[a.node]+p.wt<dist[p.node])
                {
                    dist[p.node]=dist[a.node]+p.wt;
                    pq.add(new Pair(p.node,dist[p.node]));
                }
            }
        }
        int maxT=0;
        for(int i=1;i<=n;i++)
        {
            if(dist[i]==Integer.MAX_VALUE)return -1;
            maxT=Math.max(maxT,dist[i]);
        }
        return maxT;
    }
}
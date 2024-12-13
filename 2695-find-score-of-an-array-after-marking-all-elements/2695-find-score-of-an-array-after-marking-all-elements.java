class Solution {
    public long findScore(int[] nums) {
        long score=0;
        int n=nums.length;
        boolean[] visited=new boolean[n];
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->nums[a]!=nums[b]?Integer.compare(nums[a],nums[b]):Integer.compare(a,b));
        for(int i=0;i<n;i++)
        {
            pq.add(i);
        }
        while(!pq.isEmpty())
        {
            int i=pq.poll();
            if(visited[i]) continue;
            score+=nums[i];
            visited[i]=true;
            if(i>0) visited[i-1]=true;
            if(i<n-1) visited[i+1]=true;

        }
        return score;

    }
}
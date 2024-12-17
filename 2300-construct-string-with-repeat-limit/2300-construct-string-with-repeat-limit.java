class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
        int[] freq=new int[26];
        for(char ch:s.toCharArray())
        {
            freq[ch-'a']++;
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[0]-a[0]);
        for(int i=0;i<26;i++)
        {
            if(freq[i]>0)
            {
                pq.add(new int[]{i,freq[i]});
            }
        }
        StringBuilder res=new StringBuilder();
        while(!pq.isEmpty())
        {
            int[] current=pq.poll();
            int curr=current[0];
            int f=current[1];
            char a=(char)('a'+curr);
            int count=Math.min(f,repeatLimit);
            for(int i=0;i<count;i++)
            {
                res.append(a);
            }
            if(f>count)
            {
                if(pq.isEmpty()) break;
                int[] next=pq.poll();
                char b=(char)('a'+next[0]);
                res.append(b);
                if(next[1]>1)
                {
                    pq.add(new int[]{next[0],next[1]-1});
                }
                pq.add(new int[]{curr,f-count});
            }

        }
        return res.toString();
    }
}
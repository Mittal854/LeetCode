class Pair{
    char c;
    int freq;
    Pair(char c,int freq)
    {
        this.c=c;
        this.freq=freq;
    }
}

class Solution {
    public String reorganizeString(String s) {
        int[] freq=new int[26];
        int n=s.length();
        int mid=n%2==0?n/2:(n/2)+1;
        for(char c:s.toCharArray())
        {
            freq[c-'a']++;
            if(freq[c-'a']>mid) return "";
        }
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->Integer.compare(b.freq,a.freq));
        for(int i=0;i<26;i++)
        {
            if(freq[i]>0)
            {
                pq.add(new Pair((char)('a'+i),freq[i]));
            }
        }
        StringBuilder ans=new StringBuilder();
        while(!pq.isEmpty())
        {
            Pair p=pq.poll();
            char c=p.c;
            if(ans.length()>0 && ans.charAt(ans.length()-1)==c)
            {
                if(ans.isEmpty()) return "";
                Pair q=pq.poll();
                pq.add(p);
                p=q;
            }
            ans.append(p.c);
            p.freq=p.freq-1;
            if(p.freq>0) pq.add(p);
        }
        return ans.toString();

    }
}
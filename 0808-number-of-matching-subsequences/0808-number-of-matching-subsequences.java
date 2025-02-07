class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        List<Queue<StringBuilder>>bucket=new ArrayList<>();
        for(int i=0;i<26;i++)
        {
            bucket.add(new LinkedList<>());
        }
        for(String word:words)
        {
            bucket.get(word.charAt(0)-'a').add(new StringBuilder(word));
        }
        int count=0;
        for(char c:s.toCharArray())
        {
            Queue<StringBuilder>queue=bucket.get(c-'a');
            int size=queue.size();
            for(int i=0;i<size;i++)
            {
                StringBuilder sb=queue.poll();
                sb.deleteCharAt(0);
                if(sb.length()==0) count++;
                else
                {
                    bucket.get(sb.charAt(0)-'a').add(sb);
                }
            }
        }
        return count;
    }
}
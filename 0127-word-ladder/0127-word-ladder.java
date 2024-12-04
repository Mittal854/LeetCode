class Pair{
    String word;
    int step;
    Pair(String word,int step)
    {
        this.word=word;
        this.step=step;
    }
}

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair>q=new LinkedList<>();
        HashSet<String> set=new HashSet<>(wordList);
        
        q.add(new Pair(beginWord,1));
        set.remove(beginWord);
        while(!q.isEmpty())
        {
            Pair first=q.poll();
            String word=first.word;
            int step=first.step;
            if(word.equals(endWord)) return step;
            for(int i=0;i<word.length();i++)
            {
                char[] words=word.toCharArray();
                for(char j='a';j<='z';j++)
                {
                    words[i]=j;
                    String newW=new String(words);
                    if(set.contains(newW))
                    {
                        q.add(new Pair(newW,step+1));
                        set.remove(newW);
                    }
                }
            }
            
        }
        return 0;
    }
}
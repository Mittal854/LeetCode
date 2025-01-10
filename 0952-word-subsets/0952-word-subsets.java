class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[]maxF=new int[26];
        for(String word:words2)
        {
            int[]freq=new int[26];
            for(char c:word.toCharArray())
            {
                freq[c-'a']++;
            }
            for(int i=0;i<26;i++)
            {
                maxF[i]=Math.max(maxF[i],freq[i]);
            }
        }
        List<String>ans=new ArrayList<>();
        for(String word:words1)
        {
            int[]freq=new int[26];
            for(char c:word.toCharArray())
            {
                freq[c-'a']++;
            }
            boolean all=true;
            for(int i=0;i<26;i++)
            {
                if(maxF[i]>freq[i])
                {
                    all=false;
                    break;
                }
            }
            if(all)
            {
                ans.add(word);
            }
        }
        return ans;
    }
}
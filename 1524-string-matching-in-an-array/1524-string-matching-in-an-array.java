class Solution {
    public List<String> stringMatching(String[] words) {
        List<String>ans=new ArrayList<>();
        for(String word:words)
        {
            for(String w:words)
            {
                if(word==w) continue;
                if(w.contains(word))
                {
                    ans.add(word);
                    break;
                }
            }
        }
        return ans;
    }
}
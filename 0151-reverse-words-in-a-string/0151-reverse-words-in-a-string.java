class Solution {
    public String reverseWords(String s) {
        StringBuilder ans=new StringBuilder();
        StringBuilder word=new StringBuilder();
        for(char c:s.toCharArray())
        {
            if(c==' ')
            {
                if(word.length()>0)
                {
                    if(ans.length()>0)ans.insert(0," ");
                    ans.insert(0,word);
                    word.setLength(0);
                }
            }
            else
            {
                word.append(c);
            }
        }
        if(word.length()>0)
        {
            if(ans.length()>0)ans.insert(0," ");
            ans.insert(0,word);
        }
        return ans.toString();
    }
}
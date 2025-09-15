class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        HashSet<Character>charB=new HashSet<>();
        for(char c:brokenLetters.toCharArray())
        {
            charB.add(c);
        } 
        String[] words=text.split(" ");
        int ans=0;
        for(String word:words)
        {
            boolean broke=false;
            for(char c:word.toCharArray())
            {
                if(charB.contains(c))
                {
                    broke=true;
                    break;
                }
            }
            if(!broke) ans++;
        }
        return ans;
    }
}
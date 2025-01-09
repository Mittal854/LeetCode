class Solution {
    public boolean pref(String word,String pref)
    {
        int n=word.length();
        int m =pref.length();
        if(m>n) return false;
        for(int i=0;i<m;i++)
        {
            if(word.charAt(i)!=pref.charAt(i)) return false;
        }
        return true;
    }
    public int prefixCount(String[] words, String pref) {
        int count=0;
        for(String word:words)
        {
            if(pref(word,pref)) count++;
        }
        return count;
    }
}
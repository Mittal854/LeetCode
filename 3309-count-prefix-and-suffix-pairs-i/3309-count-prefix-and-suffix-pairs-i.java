class Solution {

    public boolean isPrefixAndSuffix(String str1,String str2)
    {
        boolean pre=true;
        int in=str1.length();
        int j=0;
        for(int i=0;i<str2.length() &&j<in;i++,j++)
        {
            if(str1.charAt(j)!=str2.charAt(i)) 
            {
                pre=false;
                return false;
            }
        }
        if(j<in) return false;
        boolean suf=true;
         in=str1.length()-1;
        for(int i=str2.length()-1;i>=0 && in>=0;i--,in--)
        {
            if(str1.charAt(in)!=str2.charAt(i))
            {
                suf=false;
                return false;
            }
        }
        if(in>0) return false;
        return pre&&suf;
    }

    public int countPrefixSuffixPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length-1;i++)
        {
            for(int j=i+1;j<words.length;j++)
            {
                if(isPrefixAndSuffix(words[i],words[j])) count++;
            }
        }
        return count;
    }
}
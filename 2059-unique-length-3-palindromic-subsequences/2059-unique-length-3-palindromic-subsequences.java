class Solution {
    public int countPalindromicSubsequence(String s) {
        int count=0;
        for(char a='a';a<='z';a++)
        {
            int i1=s.indexOf(a);
            int i2=s.lastIndexOf(a);
            if(i1!=-1 && i2!=-1 && i2-i1>1)
            {
                HashSet<Character>set=new HashSet<>();
                for(int i=i1+1;i<i2;i++)
                {
                    set.add(s.charAt(i));
                }
                count+=set.size();
            }
        }
        return count;
    }
}
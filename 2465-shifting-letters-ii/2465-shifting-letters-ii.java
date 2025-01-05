class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        long[] freq=new long[s.length()+1];
        for(int[] i:shifts)
        {
            int direction=i[2];
            direction=direction==0?-1:1;
            freq[i[0]]+=direction;
            freq[i[1]+1]-=direction;
        }
        for(int i=1;i<=s.length();i++)
        {
            freq[i]+=freq[i-1];
        }
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char a=s.charAt(i);
            a=(char)(a+(int)(freq[i]%26));
            if(a<'a')
            {
                a=(char)('z'-('a'-a)+1);
            }
            else if(a>'z')
            {
                a=(char)('a'+(a-'z')-1);
            }
            ans.append(a);
        }
        return ans.toString();
    }
}
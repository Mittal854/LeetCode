class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        long[] freq=new long[s.length()];
        for(int[] i:shifts)
        {
            int direction=i[2];
            direction=direction==0?-1:1;
            for(int j=i[0];j<=i[1];j++)
            {
                freq[j]=freq[j]+direction;
            }
        }
        String ans="";
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
            ans=ans+a;
        }
        return ans;
    }
}
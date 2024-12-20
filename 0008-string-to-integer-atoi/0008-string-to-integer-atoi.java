class Solution {
    public int myAtoi(String s)
    {
        if(s.length()==0) return 0;
        int sign=1;
        int index=0;
        int n=s.length();
        while(index<n && s.charAt(index)==' ')index++;
        if(index==n) return 0;
        if(index<n && s.charAt(index)=='+' ||s.charAt(index)=='-')
        {
            if(s.charAt(index)=='-')
            {
                sign=-1;
                
            }
            index++;
        }
        int ans=0;
        while(index<n && s.charAt(index)>='0' && s.charAt(index)<='9')
        {
            if(ans>(Integer.MAX_VALUE-(s.charAt(index)-'0'))/10 )
            {
                return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            ans=ans*10+(s.charAt(index)-'0');
            index++;
        }
        return ans*sign;
    }
    
}
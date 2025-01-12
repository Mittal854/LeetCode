class Solution {
    public boolean canBeValid(String s, String locked) {
        int n=s.length();
        if(n%2!=0) return false;
        int openc=0;
        for(int i=0;i<n;i++)
        {
            if(locked.charAt(i)=='1')
            {
                if(s.charAt(i)=='(') openc++;
                else openc--;
            }
            else
            {
                openc++;
            }
            if(openc<0) return false;
        }
        int closedc=0;
        for(int i=n-1;i>=0;i--)
        {
            if(locked.charAt(i)=='1')
            {
                if(s.charAt(i)==')') closedc++;
                else closedc--;
            }
            else
            {
                closedc++;
            }
            if(closedc<0) return false;
        }
        return true;

    }
}
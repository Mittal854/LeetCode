class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String newS="";
        for(int i=0;i<s.length();i++)
        {
            char a=s.charAt(i);
            if((a>='a' && a<='z')||(a>='0' &&a<='9'))
            {
                newS+=a;
            }
        }
        int lo=0;
        int high=newS.length()-1;
        while(lo<high)
        {
            if(newS.charAt(lo)!=newS.charAt(high)) return false;
            lo++;
            high--;
        }
        return true;
    }
}
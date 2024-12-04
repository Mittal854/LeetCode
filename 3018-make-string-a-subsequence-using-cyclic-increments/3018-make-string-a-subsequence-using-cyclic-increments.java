class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int i=0;
        int j=0;
        int n=str1.length();
        int m=str2.length();
        while(i<n && j<m)
        {
            char a=str1.charAt(i);
            char b=a=='z'?'a':(char)(a+1);
            if(a==str2.charAt(j) ||b==str2.charAt(j)) j++;
            i++;
        }
        return j==m;

    }
}
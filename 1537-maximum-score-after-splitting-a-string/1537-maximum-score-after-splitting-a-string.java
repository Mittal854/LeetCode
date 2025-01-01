class Solution {
    public int maxScore(String s) {
        int sum=0;
        for(char i:s.toCharArray())
        {
            sum=sum+(i-'0');
        }
        int maxi=0;
        int zero=0;
        for(int j=0;j<s.length()-1;j++)
        {
            char i=s.charAt(j);
            if(i=='0') zero++;
            else if(i=='1') sum--;
            maxi=Math.max(maxi,zero+sum);
        }
        return maxi;
    }
}
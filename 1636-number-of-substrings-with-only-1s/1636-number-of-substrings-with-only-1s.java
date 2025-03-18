class Solution {
    public int numSub(String s) {
        long ones=0;
        long count=0;
        long mod=1_000_000_007;
        for(char c:s.toCharArray())
        {
            if(c=='1') ones++;
            else
            {
                count=(count+(ones*(ones+1)/2));
                ones=0;
            }
        }
        count=count+(ones*(ones+1)/2);
        return (int)(count%mod);
    }
}
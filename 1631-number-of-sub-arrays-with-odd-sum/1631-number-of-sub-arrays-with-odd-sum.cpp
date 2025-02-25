class Solution {
public:
    int numOfSubarrays(vector<int>& arr) {
        int mod=1000000007;
        int prefix=0;
        int oddC=0;
        int evenC=1;
        int total=0;
        for(int num:arr)
        {
            prefix+=num;
            if(prefix%2!=0)
            {
                total=(total+evenC)%mod;
                oddC++;
            }
            else
            {
                total=(total+oddC)%mod;
                evenC++;
            }
        }
        return total;
    }
};
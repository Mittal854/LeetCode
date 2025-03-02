class Solution {
public:
    int hcf(int a,int b)
    {
        if(b==0) return a;
        return hcf(b,a%b);
    }
    int smallestEvenMultiple(int n) {
        int hcf1=hcf(2,n);
        return (2*n)/hcf1;
    }
};
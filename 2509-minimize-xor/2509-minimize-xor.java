class Solution {
    public int minimizeXor(int num1, int num2) {
        int count=0;
        while(num2!=0)
        {
            count+=(num2&1);
            num2=num2>>1;
        }
        int res=0;
        for(int i=31;i>=0 && count>0;i--)
        {
            if((num1&(1<<i))!=0)
            {
                count--;
                res+=1<<i;
            }
        }
        for(int i=0;i<32 && count>0;i++)
        {
            if((num1&(1<<i))==0)
            {
                count--;
                res+=1<<i;
            }
        }
        return res;
    }
}
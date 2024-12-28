class Solution {
    public boolean lemonadeChange(int[] bills) {
        int f=0;
        int t=0;
        for(int i:bills)
        {
            if(i==5) f++;
            else if(i==10)
            {
                if(f>0)
                {
                    f--;
                    t++;
                }
                else return false;
            }
            else
            {
                if(t>0 && f>0)
                {
                    f--;
                    t--;
                }
                else if(f>=3)
                {
                    f=f-3;
                }
                else return false;
            }
        }
        return true;
    }
}
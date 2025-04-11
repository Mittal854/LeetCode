class Solution {
    public int sum(String s)
    {
        int sums=0;
        for(char c:s.toCharArray())
        {
            sums+=c-'0';
        }
        return sums;
    }
    public int countSymmetricIntegers(int low, int high) {
        int ans=0;
        for(int i=low;i<=high;i++)
        {
            String num=Integer.toString(i);
            if(num.length()%2!=0) continue;
            int n=num.length();
            String one=num.substring(0,n/2);
            String two=num.substring(n/2);
            if(sum(one)==sum(two)) ans++;
        }
        return ans;
    }
}
class Solution {
    public int toDec(String str)
    {
        int n=str.length();
        int ans=0;
        for(int i=n-1;i>=0;i--)
        {
            ans+=(str.charAt(i)-'0')*Math.pow(2,n-1-i);
        }
        return ans;
    }
    public String toString(int num,int n)
    {
        StringBuilder sb=new StringBuilder();
        while(num>0)
        {
            int rem=num%2;
            sb.insert(0,rem+"");
            num=num/2;
        }
        while(sb.length()<n)
        {
            sb.insert(0,"0");
        }
        return sb.toString();
    }
    public String findDifferentBinaryString(String[] nums) {
        int n=nums.length;
        int[] dec=new int[n];
        for(int i=0;i<n;i++)
        {
            dec[i]=toDec(nums[i]);
        }
        Arrays.sort(dec);
        int missing=n;
        for(int i=0;i<n;i++)
        {
            if(i!=dec[i])
            {
                missing=i;
                break;
            }
        }
        String ans=toString(missing,n);
        return ans;
    }
}
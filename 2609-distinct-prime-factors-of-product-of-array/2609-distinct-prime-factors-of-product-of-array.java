class Solution {
    HashSet<Integer>factors=new HashSet<>();
    public void prime(int num,int f)
    {
        if(num==1) return;
        if(num%f==0)
        {
            factors.add(f);
            prime(num/f,f);
        }
        else
        {
            prime(num,f+1);
        }
    }
    public int distinctPrimeFactors(int[] nums) {
        for(int num:nums)
        {
            prime(num,2);
        }
        return factors.size();
    }
}
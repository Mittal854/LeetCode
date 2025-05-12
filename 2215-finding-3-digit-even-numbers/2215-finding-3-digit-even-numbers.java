class Solution {
    public void helper(int[] digits,boolean[] used, int curr,int count,HashSet<Integer>ans)
    {
        if(count==3)
        {
            if(curr%2==0) ans.add(curr);
            return;
        }
        for(int i=0;i<digits.length;i++)
        {
            if(used[i]) continue;
            if (count == 0 && digits[i] == 0) continue;
            used[i]=true;
            helper(digits,used,curr*10+digits[i],count+1,ans);
            used[i]=false;
        }
    }
    public int[] findEvenNumbers(int[] digits) {
        int n=digits.length;
        boolean[] used=new boolean[n];
        HashSet<Integer> ans=new HashSet<>();
        helper(digits,used,0,0,ans);
        return ans.stream().mapToInt(Integer::intValue).sorted().toArray();

    }
}
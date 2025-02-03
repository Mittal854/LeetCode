class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans=new ArrayList<>();
        int max=0;
        for(int candy:candies)
        {
            max=Math.max(candy,max);
        }
        for(int candy:candies)
        {
            if(candy+extraCandies>=max) ans.add(true);
            else ans.add(false);
        }
        return ans;
    }
}
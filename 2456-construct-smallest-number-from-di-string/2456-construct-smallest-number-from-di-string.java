class Solution {
    public String smallestNumber(String pattern) {
        StringBuilder ans=new StringBuilder();
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<=pattern.length();i++)
        {
            st.add(i+1);
            if(i==pattern.length()||pattern.charAt(i)=='I')
            {
                while(!st.isEmpty())
                {
                    ans.append(st.pop());
                }
            }
        }
        return ans.toString();
    }
}
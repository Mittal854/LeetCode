class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>st=new Stack<>();
        for(int val:asteroids)
        {
            if(val>0) st.add(val);
            else
            {
                while(!st.isEmpty() && st.peek()>0 && st.peek()<Math.abs(val))
                {
                    st.pop();
                }
                if(st.isEmpty()||st.peek()<0) st.add(val);
                else if(st.peek()==Math.abs(val)) st.pop();
            }
        }
        int n=st.size();
        if(n==0) return new int[]{};
        int[] ans=new int[n];
        int i=n-1;
        while(!st.isEmpty())
        {
            ans[i]=st.pop();
            i--;
        } 
        return ans;
    }
}
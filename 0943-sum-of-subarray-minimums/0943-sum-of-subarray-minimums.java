class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        int[] left=new int[n];
        int[] right=new int[n];
        Arrays.fill(left,-1);
        Arrays.fill(right,n);
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && arr[st.peek()]>=arr[i])
            {
                st.pop();
            }
            if(!st.isEmpty())
            {
                left[i]=st.peek();
            }
            st.push(i);
        }
        st.clear();
        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty() && arr[st.peek()]>arr[i])
            {
                st.pop();
            }
            if(!st.isEmpty())
            {
                right[i]=st.peek();
            }
            st.push(i);
        }
        long ans=0;
        int mod=1_000_000_007;
        for(int i=0;i<n;i++)
        {
            ans+=(long)(i-left[i])*(right[i]-i)%mod*arr[i]%mod;
            ans=ans%mod;
        }
        return (int)ans;
    }
}
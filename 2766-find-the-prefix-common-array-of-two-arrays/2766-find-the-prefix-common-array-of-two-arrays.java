class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        int[] freqA=new int[51];
        int[] freqB=new int[51];
        int[]ans=new int[n];
        for(int i=0;i<n;i++)
        {
            freqA[A[i]]++;
            freqB[B[i]]++;
            int count=0;
            for(int j=1;j<=50;j++)
            {
                if(freqA[j]==freqB[j] && freqA[j]!=0) count++;
            }
            ans[i]=count;
        }
        return ans;
    }
}
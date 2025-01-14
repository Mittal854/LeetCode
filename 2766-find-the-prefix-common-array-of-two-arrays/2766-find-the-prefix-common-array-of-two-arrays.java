class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        int[]ans=new int[n];
        for(int i=0;i<n;i++)
        {
            map.put(A[i],map.getOrDefault(A[i],0)+1);
            map.put(B[i],map.getOrDefault(B[i],0)+1);
            int count=0;
            for(int j=1;j<=50;j++)
            {
                if(map.containsKey(j) && map.get(j)%2==0) count++;
            }
            ans[i]=count;
        }
        return ans;
    }
}
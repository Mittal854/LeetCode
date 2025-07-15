
class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int n=dist.length;
        double[] arr=new double[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=(double) dist[i]/speed[i];
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
        {
            if(arr[i]<=i) return i;
        }
        return n;
    }
}
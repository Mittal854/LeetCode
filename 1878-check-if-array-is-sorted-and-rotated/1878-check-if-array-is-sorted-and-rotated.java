class Solution {
    public boolean check(int[] arr) {
        int n=arr.length;
        int minIndex=0;
        int conversion=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>arr[(i+1)%n])
            {
                conversion++;
                minIndex=(i+1)%n;
            }
        }
        if(conversion>1) return false;
        for(int i=1;i<n;i++)
        {
            int prev=arr[(minIndex+i-1)%n];
            int curr=arr[(minIndex+i)%n];
            if(prev>curr) return false;
        }
        return true;
    }
}
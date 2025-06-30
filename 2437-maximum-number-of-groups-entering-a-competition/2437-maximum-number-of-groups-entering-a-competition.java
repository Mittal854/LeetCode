class Solution {
    public int maximumGroups(int[] grades) {
        int n=grades.length;
        int k=0;
        int total=0;
        while(total+k+1<=n)
        {
            k++;
            total+=k;
        }
        return k;
    }
}
class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int i=0;
        int j=0;
        ArrayList<int[]>arr=new ArrayList<>();
        while(i<n && j<m)
        {
            int[] a=new int[2];
            if(nums1[i][0]==nums2[j][0])
            {
                a[0]=nums1[i][0];
                a[1]=nums1[i][1]+nums2[j][1];
                i++;
                j++;
            }
            else if(nums1[i][0]<nums2[j][0])
            {
                a[0]=nums1[i][0];
                a[1]=nums1[i][1];
                i++;
            }
            else
            {
                a[0]=nums2[j][0];
                a[1]=nums2[j][1];
                j++;
            }
            arr.add(a);
        }
        while(i<n)
        {
            arr.add(nums1[i]);
            i++;
        }
        while(j<m)
        {
            arr.add(nums2[j]);
            j++;
        }
        return arr.toArray(int[][]:: new);
    }
}
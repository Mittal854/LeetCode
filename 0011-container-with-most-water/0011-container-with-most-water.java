class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxV=0;
        while(left<right)
        {
            int w=right-left;
            int h=Math.min(height[left],height[right]);
            int vol=w*h;
            maxV=Math.max(maxV,vol);
            if(height[left]<height[right]) left++;
            else right--;
        }
        return maxV;
    }
}
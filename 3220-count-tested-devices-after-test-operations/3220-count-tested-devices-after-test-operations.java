class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int ans=0;
        for(int i:batteryPercentages)
        {
            if(i>0 && i-ans>0) ans++;
        }
        return ans;
    }
}
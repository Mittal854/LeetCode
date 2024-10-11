class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        vector<int> num3;
        double med;
        for(int i:nums1)
        {
            num3.push_back(i);
        }
        for(int i:nums2)
        {
            num3.push_back(i);
        }
        sort(num3.begin(),num3.end());
        if(num3.size()%2!=0)
        {
            med=num3[(num3.size()-1)/2];
        }
        else{
            int i=num3.size()/2;
            int j=i-1;
            //med=(num3[i]+num3[j])/2;
            med = static_cast<double>(num3[i] + num3[j]) / 2.0;
        }
        return med;
    }
};
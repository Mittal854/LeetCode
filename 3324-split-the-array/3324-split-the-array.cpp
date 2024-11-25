class Solution {
public:
    bool isPossibleToSplit(vector<int>& nums) {
        bool poss=true;
        sort(nums.begin(),nums.end());
        vector<int>nums1;
        vector<int>nums2;
        for(int i=0;i<nums.size();i++)
        {
            if(i%2==0)
            {
                nums1.push_back(nums[i]);
            }
            else{
                nums2.push_back(nums[i]);
            }
        }
        for(int i=0;i<nums1.size()-1;i++)
        {
            if(nums1[i]==nums1[i+1] || nums2[i]==nums2[i+1])
            {
                poss=false;
            }
        }
        return poss;
    }
};
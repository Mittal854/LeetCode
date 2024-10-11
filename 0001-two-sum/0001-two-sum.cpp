class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        map<int,int> mpp;
        int n=nums.size();
        for(int i=0;i<n;i++)
        {
            int no=nums[i];
            int mo=target-no;
            if(mpp.find(mo)!=mpp.end())
            {
                return {mpp[mo],i};
            }
            mpp[no]=i;
        }
        return {-1,-1};
    }
};
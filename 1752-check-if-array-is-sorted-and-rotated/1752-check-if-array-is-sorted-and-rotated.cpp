class Solution
{
public:
    bool check(vector<int> &nums)
    {
        vector<int> sorted;
        sorted = nums;
        sort(sorted.begin(), sorted.end());
        // bool rotated = false;
        for (int i = 0; i < nums.size(); i++)
        {
            vector<int> temp;
            for(int i=1;i<nums.size();i++)
            {
                temp.push_back(nums[i]);
            }
            temp.push_back(nums[0]);
            nums=temp;
            if(nums==sorted)
            {
                return true;
                
            }

        }
        return false;
    }
};
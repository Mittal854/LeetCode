class Solution
{
public:
    int removeDuplicates(vector<int> &nums)
    {
        vector<int> newVec;
        int count=1;
        newVec.push_back(nums[0]);
        for(int i=1;i<nums.size();i++)
        {
            if(newVec.back()!=nums[i])
            {
                newVec.push_back(nums[i]);
                count++;
            }
        }
        nums.clear();
        nums=newVec;
        return count;
    }
};
class Solution
{
public:
    int lastStoneWeight(vector<int> &stones)
    {
        sort(stones.begin(), stones.end());
        if (stones.size() == 1)
        {
            int a = stones.back();
            return a;
        }
        while (stones.size() > 1)
        {
            int b = stones.back();
            stones.pop_back();
            int a = stones.back();
            stones.pop_back();
            if (a < b)
            {
                stones.push_back(b - a);
                sort(stones.begin(), stones.end());
            }
        }
        if (stones.empty())
        {
            return 0;
        }
        else
        {
            int a = stones.back();
            return a;
        }
    }
};
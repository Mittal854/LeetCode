class Solution
{
public:
    int waysToMakeFair(vector<int> &nums)
    {
        // int fair = 0;
        // vector<int> temp = nums;
        // for (int i = 0; i < nums.size(); i++)
        // {
        //     temp.erase(temp.begin() + i);
        //     int sum1 = 0, sum2 = 0;
        //     for (int j = 0; j < temp.size(); j++)
        //     {
        //         if (j % 2 == 0)
        //         {
        //             sum1 += temp[j];
        //         }
        //         else
        //         {
        //             sum2 += temp[j];
        //         }
        //     }
        //     temp = nums;
        //     if (sum1 == sum2)
        //     {
        //         fair++;
        //     }
        // }
        // return fair;
        int n = nums.size();
        int count = 0;
        int evenSum = 0, oddSum = 0;

        // Calculate the initial sum of elements at even and odd indices
        for (int i = 0; i < n; ++i)
        {
            if (i % 2 == 0)
                evenSum += nums[i];
            else
                oddSum += nums[i];
        }

        // Iterate through the array, removing one element at a time
        for (int i = 0; i < n; ++i)
        {
            // Update the sums after removing nums[i]
            if (i % 2 == 0)
                evenSum -= nums[i];
            else
                oddSum -= nums[i];

            // Check if removing nums[i] makes the array fair
            if (evenSum == oddSum)
                count++;

            // Restore the sums for the next iteration
            if (i % 2 == 0)
                oddSum += nums[i];
            else
                evenSum += nums[i];
        }

        return count;
    }
};
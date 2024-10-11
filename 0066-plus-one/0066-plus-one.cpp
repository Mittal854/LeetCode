class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        // long long n=0;
        // for(int i:digits)
        // {
        //     n=n*10+i;
        // }
        // n=n+1;
        // vector<int> result;
        // while(n>0)
        // {
        //     int digit=n%10;
        //     result.push_back(digit);
        //     n=n/10;
        // }
        // reverse(result.begin(),result.end());
        // return result;
        int n = digits.size();

        for (int i = n - 1; i >= 0; --i)
        {
            if (digits[i] == 9)
            {
                digits[i] = 0;
            }
            else
            {
                digits[i]++;
                return digits;
            }
        }

        // If all digits were 9, add a new digit at the beginning
        digits.insert(digits.begin(), 1);

        return digits;
    }
};
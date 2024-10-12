class Solution
{
public:
    string maximumOddBinaryNumber(string s)
    {
        sort(s.begin(), s.end());
        reverse(s.begin(), s.end());

        s.erase(0, 1);
        s = s + '1';
        return s;
    }
};
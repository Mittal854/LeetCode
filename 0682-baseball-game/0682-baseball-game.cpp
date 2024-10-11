class Solution
{
public:
    int calPoints(vector<string> &operations)
    {
        vector<int> result;
        for (string i : operations)
        {
            if (i != "+" && i != "D" && i != "C")
            {
                result.push_back(stoi(i));
            }
            else
            {
                if (i == "C")
                {
                    result.pop_back();
                }
                else if (i == "D")
                {
                    int a = result.back();
                    result.push_back(a * 2);
                }
                else if (i == "+")
                {
                    int a = result.back();
                    result.pop_back();
                    int b = result.back();
                    result.push_back(a);
                    result.push_back(a + b);
                }
            }
        }
        int sum = 0;
        for (int i : result)
        {
            sum += i;
        }
        return sum;
    }
};
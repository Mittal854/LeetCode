class Solution {
    // private Map<String,Boolean>map;
    // public boolean helper(String s,int target,int index,int curr)
    // {
    // if(index==s.length())
    // {
    // return target==curr;
    // }
    // String key=index+"-"+curr;
    // if(map.containsKey(key)) return map.get(key);
    // int num=0;
    // for(int i=index;i<s.length();i++)
    // {
    // num=num*10+(s.charAt(i)-'0');
    // if(curr+num>target) break;
    // if(helper(s,target,i+1,curr+num))
    // {
    // map.put(key,true);
    // return true;
    // }
    // }
    // map.put(key,false);
    // return false;
    // }
    // public int punishmentNumber(int n) {
    // int sum=0;
    // for(int i=1;i<=n;i++)
    // {
    // map=new HashMap<>();
    // int sq=i*i;
    // String s=Integer.toString(sq);
    // if(helper(s,i,0,0)) sum+=sq;
    // }
    // return sum;
    // }
    int arr[] = { 1, 9, 10, 36, 45, 55, 82, 91, 99, 100, 235, 297, 369, 370, 379, 414, 657, 675, 703, 756, 792, 909,
            918, 945, 964, 990, 991, 999, 1000 };

    public int punishmentNumber(int n) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= n) {
                res += arr[i] * arr[i];
            } else {
                break;
            }
        }
        return res;
    }
}

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
         Set<Integer> num1 = new HashSet<>();
        Set<Integer> num2 = new HashSet<>();
        for (int num : nums1) {
            num1.add(num);
        }
        for (int num : nums2) {
            num2.add(num);
        }
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>a=new ArrayList<>();
        List<Integer>b=new ArrayList<>();
        for(int i:num1)
        {
            if(!num2.contains(i)) a.add(i);
        }
        for(int i:num2)
        {
            if(!num1.contains(i)) b.add(i);
        }
        ans.add(new ArrayList<>(a));
        ans.add(new ArrayList<>(b));
        return ans;
    }
}
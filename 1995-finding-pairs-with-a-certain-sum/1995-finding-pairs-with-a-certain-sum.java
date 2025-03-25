class FindSumPairs {
    HashMap<Integer,Integer>map;
    int[] nums1;
    int[] nums2;
    public FindSumPairs(int[] nums1, int[] nums2) {
        map=new HashMap<>();
        this.nums1=nums1;
        this.nums2=nums2;
        for(int i:nums2)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
    }
    
    public void add(int index, int val) {
        int old=nums2[index];
        map.put(old,map.get(old)-1);
        if(map.get(old)==0) map.remove(old);
        nums2[index]=val+old;
        int newv=nums2[index];
        map.put(newv,map.getOrDefault(newv,0)+1);
    }
    
    public int count(int tot) {
        int count=0;
        for(int i:nums1)
        {
            int diff=tot-i;
            count+=map.getOrDefault(diff,0);
        }
        return count;

    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */
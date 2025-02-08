class NumberContainers {
    HashMap<Integer,Integer>map;
    HashMap<Integer,TreeSet<Integer>>val;
    public NumberContainers() {
        map=new HashMap<>();
        val=new HashMap<>();
    }
    
    public void change(int index, int number) {
        if(map.containsKey(index))
        {
            val.get(map.get(index)).remove(index);
            if(val.get(map.get(index)).size()==0)
            {
                val.remove(map.get(index));
            }
        }
        map.put(index,number);
        val.putIfAbsent(number, new TreeSet<>());
        val.get(number).add(index);
    }
    
    public int find(int number) {
        if(val.containsKey(number))
        {
            return val.get(number).first();
        }
        return -1;
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */
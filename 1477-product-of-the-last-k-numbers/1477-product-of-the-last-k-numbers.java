class ProductOfNumbers {
    ArrayList<Integer>arr;
    int n;
    int prev;
    public ProductOfNumbers() {
        arr=new ArrayList<>();
        n=1;
        prev=-1;
        arr.add(1);
    }
    
    public void add(int num) {
        if(arr.get(n-1)==0) arr.add(num);
        else arr.add(num*arr.get(n-1));

        if(arr.get(n)==0) prev=n;
        n++;
    }
    
    public int getProduct(int k) {
        int index=n-k-1;
        if(prev>=n-k) return 0;
        else if(arr.get(index)==0) return arr.get(n-1);
        return arr.get(n-1)/arr.get(index);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
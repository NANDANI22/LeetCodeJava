class StockSpanner {
      Stack<Integer> st;
      int arr[];
      int i;
    public StockSpanner() {
       st = new Stack<>();
       arr = new int[10000];
       i = 0;
    } 
    public int next(int price) {
        arr[i] = price;
        while(!st.isEmpty() && arr[st.peek()] <= arr[i]){
            st.pop();
        }
        int span;
        if(st.isEmpty()){
            span = i +1;
        }
        else{
            span = i - st.peek();
        }
        st.push(i);
        i++;
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
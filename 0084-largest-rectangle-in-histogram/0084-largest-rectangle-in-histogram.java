class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        int left[] = new int[n];
        int right[]= new int[n];
        //left
        for(int i=0; i<n; i++){
            while(!st1.isEmpty() && heights[st1.peek()] >= heights[i]){
                st1.pop();
            }
            if(st1.isEmpty()) left[i]= -1;
            else{
                left[i] = st1.peek();
            }
            st1.push(i);
        }
        //right
        for(int i = n-1; i>=0; i--){
            while(!st2.isEmpty() && heights[st2.peek()] >= heights[i]){
                st2.pop();
            }
            if(st2.isEmpty()) right[i] = heights.length;
            else right[i] = st2.peek();
            st2.push(i);
        }
        int max = 0;
        for(int i=0; i<n; i++){
            int area = heights[i] * (right[i] - left[i] - 1);
            max = Math.max(max, area);
        }
        return max;
    }
}
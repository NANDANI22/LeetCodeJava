class Solution {
    public static int solve(int [] heights){
        int n = heights.length;
        int left[] = new int[n];
        int right[] = new int[n];
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        for(int i=0; i<n; i++){
            while(!st1.isEmpty() && heights[st1.peek()] >= heights[i]){
                st1.pop();
            }
            if(st1.isEmpty()) left[i] = -1;
            else left[i] = st1.peek();
            st1.push(i);
        }
        for(int i=n-1; i>=0; i--){
            while(!st2.isEmpty() && heights[st2.peek()] >= heights[i]){
                st2.pop();
            }
            if(st2.isEmpty()) right[i] = n;
            else right[i] = st2.peek();
            st2.push(i);
        }
        int max = 0;
        for(int i=0; i<n; i++){
            int area = heights[i] *( right[i] - left[i] - 1);
            max = Math.max(max, area);
        }
        return max;
    }
    public int maximalRectangle(char[][] matrix) {
        int maxA = 0;
        int heights[] = new int[matrix[0].length];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j] == '1'){
                    heights[j]++;
                }
                else {
                    heights[j] = 0;
                }
            }
            maxA = Math.max(maxA, solve(heights));
        }
        return maxA;
    }
}
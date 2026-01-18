class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left[] = new int[n];
        int maxLeft = 0;
        for(int i=0; i<n; i++){
            left[i] = maxLeft;
            maxLeft = Math.max(maxLeft , height[i]);
        }
        int right[] = new int[n];
        int maxR = 0;
        for(int i=n-1; i>=0; i--){
            right[i] = maxR;
            maxR = Math.max(maxR , height[i]);
        }
        int ans = 0;
        for(int i=0; i<n; i++){
            int sum = Math.min(left[i] , right[i]) - height[i];
            if(sum >0 ){
                ans += sum;
            }
        }
        return ans;
    }
}
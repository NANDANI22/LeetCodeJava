class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int res = 1;
        for(int i = 0; i < n; i++){
            arr[i] = res;
            res = nums[i] * res;
        }
        res = 1;
        for(int i = n - 1; i >= 0; i--){
            arr[i] = arr[i] * res;
            res = nums[i] * res;
        }
        return arr;
    }
}
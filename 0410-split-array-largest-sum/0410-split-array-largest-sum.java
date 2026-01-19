class Solution {
    public int splitArray(int[] nums, int k) {
        int first = 0, last = 0, ans = -1;

        for(int i : nums){
            first = Math.max(first, i);
            last += i;
        }
        while(first <= last){
            int mid = first + (last - first) / 2;
            if(isValid(nums,mid,k)){
                ans = mid;
                last = mid - 1;
            }else{
                first = mid + 1;
            }
        }
        return ans;
    }
    public static boolean isValid(int[] arr, int upper, int k){
        int sum = 0;
        int sub = 1;        // atleast one subarray
        for(int num : arr){
            if(sum + num <= upper){
                sum += num;
            }else{
                sub++;        // new subarray
                sum = num;
            }
        }
        return sub <= k;
    }
}
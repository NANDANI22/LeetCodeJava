class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int first = 1 , last = 0;
        for(int a : nums){
            last = Math.max(last , a);
        }
        int ans = -1;
        while(first <= last){
            int mid = first + (last - first)/2;
            if(isValid(nums, mid , threshold)){
                last = mid -1;
                ans = mid;
            }
            else first = mid +1;
        }
        return ans;
    }
    public static boolean isValid(int nums[] , int count , int threshold ){
        int sum = 0;
        for(int n : nums){
            if(n % count == 0){
                sum += n/count;
            }
            else sum += n/count +1;
        }
        return sum <= threshold;
    }
}
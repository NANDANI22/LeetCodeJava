class Solution {
    public int solve(int nums[] , int first , int last , boolean isStarting , int target){
        int ans = -1;
        while(first <= last){
            int mid = first + (last - first) / 2;
            if(nums[mid] == target) {
                ans = mid;
            if(isStarting) last = mid -1;
            else first = mid +1;
            }
           else if(nums[mid] < target){
              first = mid +1;
            }
            else{
                last = mid -1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int temp[] = new int[2];
        temp[0] = solve(nums , 0 ,nums.length-1 , true , target);
        temp[1] = solve(nums , 0 , nums.length-1 , false , target);
        return temp;
    }
}
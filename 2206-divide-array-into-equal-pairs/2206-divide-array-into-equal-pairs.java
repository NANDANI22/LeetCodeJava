class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        int pair = 0;
        for(int i=0; i<nums.length;){
            if(nums[i] == nums[i+1]){
                pair++;
                i+=2;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
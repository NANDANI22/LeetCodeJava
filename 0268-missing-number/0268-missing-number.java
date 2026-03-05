class Solution {
    static void swap(int nums[] , int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public int missingNumber(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int currIdx = nums[i];
            if(nums[i]<nums.length && nums[i] != nums[currIdx]){
                swap(nums , i ,currIdx);
            }
            else{
                i++;
            }
        }
         for(i=0; i<nums.length; i++){
            if(i!=nums[i]) return i;
        }
        return nums.length;
    }
}
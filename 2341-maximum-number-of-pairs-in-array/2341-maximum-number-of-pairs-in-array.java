class Solution {
    public int[] numberOfPairs(int[] nums) {
       Arrays.sort(nums);
       int pair = 0;
       for(int i=0; i<nums.length-1;){
        if(nums[i] == nums[i+1]){
            pair++;
            i+=2;
        }
        else{
            i++;
        }
       }
       return new int[]{pair , (nums.length-(2*pair))}; 
    }
}
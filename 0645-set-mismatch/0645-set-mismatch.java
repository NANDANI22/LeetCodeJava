class Solution {
    static void swap(int nums[] , int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public int[] findErrorNums(int[] nums) {
      int i = 0;
      while(i < nums.length){
        int cIdx = nums[i] - 1;
        if(nums[i] != nums[cIdx]){
            swap(nums , i , cIdx);
        }
        else{
            i++;
        }
      }  
      for(i=0; i<nums.length; i++){
        if(nums[i] != i+1){
            return new int[]{nums[i] , i+1};
        }
      }
      return new int[]{-1,-1};
    }
}
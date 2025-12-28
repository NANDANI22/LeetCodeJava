class Solution {
    public int[] sortEvenOdd(int[] nums) {
        for(int i=0; i<nums.length-1; i+=2){
            for(int j=0; j<nums.length-2; j+=2){
                if(nums[j] > nums[j+2]){
                    int temp = nums[j];
                    nums[j] = nums[j+2];
                    nums[j+2] = temp;
                }
            }
        }
         for(int i=1; i<nums.length; i+=2){
                for(int j=1; j<nums.length-2; j+=2){
                    if(nums[j] < nums[j+2]){
                        int temp = nums[j];
                        nums[j] = nums[j+2];
                        nums[j+2] = temp;
                    }
                }
            }
            return nums;
    }
}
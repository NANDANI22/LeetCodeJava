class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxc = 0, count = 0;
        for(int a : nums){
            if(a==0){
                maxc = Math.max(maxc , count);
                count = 0;
            }
            else{
                count++;
            }
        }
        return Math.max(maxc,count);
    }
}
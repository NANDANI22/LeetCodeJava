import java.util.List;
import java.util.ArrayList;
class Solution {
    static void swap(int nums[] , int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while(i<nums.length){
            int cIdx = nums[i] - 1;
            if(nums[i] != nums[cIdx]){
                swap(nums,i,cIdx);
            }
            else{
                i++;
            }
        }
        for(i=0; i<nums.length; i++){
            if(nums[i] != i+1){
                list.add(nums[i]);
            }
        }
        return list;
    }
}
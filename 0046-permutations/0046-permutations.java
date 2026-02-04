class Solution {
    public void swap(int nums[] , int i , int j){
        int temp= nums[i] ;
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void solve(List<List<Integer>> ans, int nums[] , int i){
      if(i==nums.length){
            List<Integer> cur = new ArrayList<>();
            for(int a : nums) cur.add(a);
            ans.add(cur);
            return;
      }
      for(int j=i; j<nums.length; j++){
        swap(nums, i , j);
        solve(ans, nums , i+1);
        swap(nums , i , j);
      }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(ans, nums, 0);
        return ans;
    }
}
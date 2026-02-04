class Solution {
    public void swap(int nums[] , int i , int j){
        int temp = nums[i] ;
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
         Set<Integer> set = new HashSet<>(); 
        for(int j=i; j<nums.length; j++){
            if(set.contains(nums[j])) continue;
            set.add(nums[j]);
            swap(nums, i , j);
            solve(ans, nums , i+1);
            swap(nums , i, j);
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        solve(ans, nums ,0);
        return ans;
    }
}
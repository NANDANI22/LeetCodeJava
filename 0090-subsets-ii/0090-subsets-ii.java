class Solution {
    public void solve(List<List<Integer>> ans, List<Integer> cur, int nums[] , int i){
        if(i==nums.length){
            ans.add(new ArrayList<>(cur));
            return;
        }
       //pick
       cur.add(nums[i]);
       solve(ans, cur, nums , i+1);
       cur.remove(cur.size() -1);
       int next = i+1;
       while(next < nums.length && nums[next] == nums[i]){
        next++;
       }
       solve(ans, cur , nums , next);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        Arrays.sort(nums);
        solve(ans, cur , nums, 0);
        return ans;
    }
}
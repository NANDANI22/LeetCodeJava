class Solution {
    public void solve(List<List<Integer>> ans, List<Integer> cur, int i, int candidates[], int target) {
        if (target < 0)
            return;
        if (i == candidates.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(cur));
                return;
            }
            return;
        }
        if (candidates[i] <= target) {
            cur.add(candidates[i]);
            solve(ans, cur, i, candidates, target - candidates[i]);
            cur.remove(cur.size() - 1);
        }
        solve(ans, cur, i + 1, candidates, target);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        solve(ans, cur, 0, candidates, target);
        return ans;
    }
}
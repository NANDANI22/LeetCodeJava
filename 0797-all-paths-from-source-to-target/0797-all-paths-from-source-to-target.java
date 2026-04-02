class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        boolean isVis[] = new boolean[graph.length];
        solve(graph , 0 , graph.length-1 , ans , list , isVis);
        return ans;
    }
    void solve(int[][]graph , int src , int dest , List<List<Integer>>ans , List<Integer> list , boolean isVis[]){
        list.add(src);
        isVis[src] = true;
        if(src == dest){
            ans.add(new ArrayList<>(list));
        }
        for(int a : graph[src]){
            if(!isVis[a]){
                solve(graph , a , dest , ans , list , isVis);
            }
        }
        list.remove(list.size()-1);
        isVis[src] = false;
    }
}
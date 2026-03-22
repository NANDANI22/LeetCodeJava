class Solution {
    public void solve(List<List<Integer>> rooms , int a , boolean isVis[]){
        isVis[a] = true;
        for(int i:rooms.get(a)){
            if(!isVis[i])
            solve(rooms , i , isVis);
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean isVis[] = new boolean[rooms.size()];
        solve(rooms , 0 , isVis);
        for(boolean b : isVis){
            if(!b) return false;
           
        }
         return true;
    }
}
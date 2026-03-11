class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=n; i++){
            list.add(i);
        }
        return solve(list , 0 , k);
    }
    public int solve(List<Integer>list , int i , int k){
        if(list.size()==1)
        return list.get(0);
       int kill =( i+k-1)%list.size();
        list.remove(kill);

     return solve(list , kill , k);
    }
}
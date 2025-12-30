class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int first = 1 , last = 0;
        for(int p :piles){
            last = Math.max(last , p);
        }
        int ans = -1;
        while(first <= last){
            int mid = first + (last - first)/2;
            if(isValid(piles,mid,h)){
                last = mid -1;
                 ans = mid;
            }
            else{
                first = mid +1;
            }
        }
        return ans;
    }
    public boolean isValid(int piles[] , int s , int h){
        long total = 0;
        for(int i=0; i<piles.length; i++){
            if(piles[i] % s == 0){
            total += piles[i] /s;
            }
            else{
                total += (piles[i]/s) +1;
            }
        }
        return total <= h;
    }
}
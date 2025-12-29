class Solution {
    public boolean isValid(int weights[] , int upper , int days){
        int sum = 0, count = 1;
        for(int i=0; i<weights.length; i++){
            if(sum + weights[i] > upper){
                count++;
                sum = weights[i];
            }
            else sum += weights[i];
        }
        return count <=days;
    }
    public int shipWithinDays(int[] weights, int days) {
        if(days > weights.length) return -1;
        int first = Integer.MIN_VALUE , last = 0 ,ans = -1;
        for(int i=0; i<weights.length; i++){
            last += weights[i];
            first = Math.max(first , weights[i]);
        }
        while(first<=last){
            int mid = first + (last - first)/2;
            if(isValid(weights , mid, days)){
                ans = mid;
                last = mid -1;
            }
            else{
                first = mid +1;
            }
        }
        return ans;
    }
}
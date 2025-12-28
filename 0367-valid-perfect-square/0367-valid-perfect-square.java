class Solution {
    public boolean isPerfectSquare(int num) {
        long first = 0, last = num;
        while(first <= last){
            long mid = first +(last - first)/2;
            if((mid * mid) == num) return true;
            else if((mid * mid) < num) first = mid +1;
            else last = mid -1;
        }
        return false;
    }
}
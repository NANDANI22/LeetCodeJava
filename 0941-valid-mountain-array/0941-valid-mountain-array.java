class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if(n < 3) return false;
        int c = 0;
        for(int i=1; i<n; i++){
            if(arr[i] > arr[i-1]) c++;
            else {
                break;
            }
        }
        if(c == 0 || c == n-1) return false;
        for(int i = c +1; i<n; i++){
            if(arr[i] >= arr[i-1]) return false;
        }
        return true;
    }
}
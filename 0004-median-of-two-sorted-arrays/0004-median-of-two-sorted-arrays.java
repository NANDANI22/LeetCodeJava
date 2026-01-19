class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if(n<m){
            return findMedianSortedArrays(nums2,nums1);
        }
        int start = 0, end = m;

        while(start <= end){
            int mid1 = (start + end) / 2;
            int mid2 = (m + n + 1)/ 2 - mid1;
            int l1 = mid1 == 0 ? Integer.MIN_VALUE : nums1[mid1 - 1];
            int l2 = mid2 == 0 ? Integer.MIN_VALUE : nums2[mid2 - 1];
            int r1 = mid1 == m ? Integer.MAX_VALUE : nums1[mid1];
            int r2 = mid2 == n ? Integer.MAX_VALUE : nums2[mid2];
            if(l1 <= r2 && l2 <= r1){
                if((m + n) % 2 == 0){
                    return (Math.max(l1,l2) + Math.min(r1,r2)) / 2.0;
                }else{
                    return Math.max(l1,l2);
                }
            }else{
                if(l2 > l1){
                    start = mid1 + 1;
                }else{
                    end = mid1 - 1;
                }
            }
        }
        return 0.0;
    }
}
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result=new HashSet<>();
         for(int a : nums1){
            set.add(a);
        }
        for(int b : nums2){
            if(set.contains(b)){
                result.add(b);
            }
        }
        int ans[] = new int[result.size()];
        int index = 0;

        for(int val : result){
            ans[index++] = val;
        }
        return ans;
    }
}
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer ,Integer> map = new HashMap<>();
        map.put(0 , -1);
        int sum =0;
        int index = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i] == 0 ? -1 : 1;
            if(!map.containsKey(sum)){
                map.put(sum , i);
            }
            if(map.containsKey(sum)){
                index = Math.max(index , i-map.get(sum));
            }
        }
        return index;
    }
}
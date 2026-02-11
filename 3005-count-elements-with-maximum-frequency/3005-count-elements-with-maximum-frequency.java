class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int a : nums){
            if(map.containsKey(a)){
                map.put(a, map.get(a) + 1);
            
            }
            else{
                map.put(a , 0+1);
            }
        }
        
        int maxFreq = 0;

        // Find maximum frequency
        for (int freq : map.values()) {
            maxFreq = Math.max(maxFreq, freq);
        }

        int count = 0;

        // Count total elements having max frequency
        for (int freq : map.values()) {
            if (freq == maxFreq) {
                count += freq;
            }
        }

        return count;
    }
}
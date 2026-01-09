class Solution {
    public int longestConsecutive(int[] nums) {
       HashSet<Integer> set = new HashSet<>();
       for(int a : nums) set.add(a);
       long max = 0;
       for(int a : set){
        if(set.contains(a-1)){
            continue;
        }
         long count = 1;
        
        
            while(set.contains(++a)){
                count++;
            }
            max = Math.max(max,count);
        
       } 
       return (int)max;
    }
}
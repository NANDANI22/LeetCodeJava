class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0, i = 0, j = 0;
        if(s.length()==0 || s.length()==1) return s.length();
        HashSet<Character> set = new HashSet<>();
        while(j<s.length()){
            char ch = s.charAt(j);
            if(!set.contains(ch)){
                set.add(ch);
                max = Math.max(max,j-i+1);
                j++;
            }
            else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }
}
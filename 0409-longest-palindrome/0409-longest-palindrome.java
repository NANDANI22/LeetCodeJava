class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character ,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0) +1);
        }
        int longest = 0;
        for(char key : map.keySet()){
            if(map.get(key) % 2==0) longest += map.get(key);
            else if(map.get(key)>=3) longest += map.get(key) -1;
        }
        if(s.length() > longest) return longest +1;
        return longest;
    }
}
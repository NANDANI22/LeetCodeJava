class Solution {
    public int rearrangeCharacters(String s, String target) {
        int freq[] = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }
        int freq2[] = new int[26];
        for(char ch : target.toCharArray()){
            freq2[ch - 'a']++;
        }
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<26; i++){
            if(freq2[i] > 0){
                ans = Math.min(ans , freq[i] / freq2[i]);
            }
        }
        return ans;
    }
}
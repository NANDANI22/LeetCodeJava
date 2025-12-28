class Solution {
    public String greatestLetter(String s) {
        boolean upperCase[] = new boolean[26];
        boolean lowerCase[] = new boolean[26];

        for(char ch : s.toCharArray()){
            if(ch >= 'a' && ch <= 'z'){
                lowerCase[ch - 'a'] = true;
            }
            if(ch >= 'A' && ch <= 'Z'){
                upperCase[ch - 'A'] = true;
            }
        }
        for(int i=25; i>=0; i--){
            if(lowerCase[i] && upperCase[i]){
                return String.valueOf((char)('A' + i));
            }
        }
        return "";
    }
}
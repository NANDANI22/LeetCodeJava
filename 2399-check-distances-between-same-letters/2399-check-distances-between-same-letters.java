class Solution {
    public boolean checkDistances(String s, int[] distance) {
        int firstIdx[] = new int[26];
        for(int i=0; i<26; i++){
            firstIdx[i] = -1;
        }
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int idx = ch - 'a';

            if(firstIdx[idx] == -1){
                firstIdx[idx] = i;
            }
            else{
                int gap = i - firstIdx[idx] - 1;
                if(gap != distance[idx]) return false;
            }
        }
        return true;
    }
}
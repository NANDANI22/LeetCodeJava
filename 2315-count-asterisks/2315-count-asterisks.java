class Solution {
    public int countAsterisks(String s) {
        int bar = 0;
        int star = 0;
        for(char ch : s.toCharArray()){
            if(ch == '|') bar++;
            if(ch == '*' && bar % 2 == 0){
                star++;
            }
        }
        return star;
    }
}
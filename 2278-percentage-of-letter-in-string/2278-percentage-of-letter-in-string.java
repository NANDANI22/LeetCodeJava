class Solution {
    public int percentageLetter(String s, char letter) {
        int count = 0 , percent = 0;
        for(char ch : s.toCharArray()){
            if(ch == letter){
                count++;
            }
        }
        percent = ((count*100)/s.length());
        return percent;
    }
}
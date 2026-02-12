class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(String sentence : sentences){
             String[] words = sentence.split(" ");
            int count = words.length;
            if(count > max){
                max = count;
            }
        }
        return max;
    }
}
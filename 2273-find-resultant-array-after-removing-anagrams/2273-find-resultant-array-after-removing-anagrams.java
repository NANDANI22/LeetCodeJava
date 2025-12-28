class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> list = new ArrayList<>();
        list.add(words[0]);

        int prevFreq[] = getFreq(words[0]);
        for(int i=1; i<words.length; i++){
            int currFreq[] = getFreq(words[i]);

            if(!Arrays.equals(prevFreq , currFreq)){
                list.add(words[i]);
                prevFreq = currFreq;
            }
        }
        return list;
    }
    private int[] getFreq(String word){
        int freq[] = new int[26];
        for(char ch : word.toCharArray()){
            freq[ch - 'a']++;
        }
        return freq;
    }
}
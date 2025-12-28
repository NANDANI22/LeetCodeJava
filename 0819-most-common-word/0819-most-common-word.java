class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> ban = new HashSet<>();
        for(String b : banned){
            ban.add(b);
        }
        paragraph = paragraph.toLowerCase().replaceAll("[^a-z]" , " ");
        HashMap<String, Integer> countMap = new HashMap<>();
        String words[] = paragraph.split("\\s+");
        String result = "";
        int maxC = 0;
        for(String word  : words){
            if(word.length() == 0 || ban.contains(word)){
                continue;
            }
            int count = countMap.getOrDefault(word,0)+1;
            countMap.put(word,count);
            if(count > maxC){
                maxC = count;
                result = word;
            }
        }
        return result;
    }
}
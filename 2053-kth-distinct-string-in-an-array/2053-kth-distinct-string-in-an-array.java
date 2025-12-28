class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String , Integer> map = new HashMap<>();
        for(String a : arr){
            map.put(a, map.getOrDefault(a,0)+1);
        }
        int count = 0;
        for(String a : arr){
            if(map.get(a) == 1){
              count++;
              if(count == k){
                return a;
              }
            }
        }
        return "";
    }
}
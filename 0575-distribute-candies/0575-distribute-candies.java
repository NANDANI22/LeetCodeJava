class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
       HashSet<Integer> set = new HashSet<>();
       for(int candy : candyType){
        set.add(candy);
       }
       int allowCandy = n/2;
       return Math.min(set.size(),allowCandy);
    }
}
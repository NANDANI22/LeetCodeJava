class Solution {
    public String largestGoodInteger(String num) {
        String best = "";
        for(int i=0; i+2<num.length(); i++){
            int first = num.charAt(i);
            int second = num.charAt(i+1);
            int third = num.charAt(i+2);

            if(first == second && first == third){
                String curr = num.substring(i,i+3);
                if(curr.compareTo(best) > 0){
                best = curr;
            }
            } 
        }
        return best;
    }
}
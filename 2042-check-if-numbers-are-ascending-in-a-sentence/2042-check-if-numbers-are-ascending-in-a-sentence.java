class Solution {
    public boolean areNumbersAscending(String s) {
        String tokens[] = s.split(" ");
        int prev = -1;
        for(String token : tokens){
            if(Character.isDigit(token.charAt(0))){
                int curr = Integer.parseInt(token);
                if(curr <= prev){
                return false;
            }
              prev = curr;
            }
        }
        return true;
    }
}
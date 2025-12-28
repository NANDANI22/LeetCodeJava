class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if(password.length() < 8) return false;
        boolean upper = false , lower = false , digit = false , specialChar = false;
        for(int i = 0; i<password.length(); i++){
           char ch = password.charAt(i);
            if (i > 0 && password.charAt(i) == password.charAt(i - 1)) {
                return false; 
            }
            else if(Character.isUpperCase(ch)){
                upper = true;
            }
            else if(Character.isLowerCase(ch)){
                lower = true;
            }
            else if(Character.isDigit(ch)){
                digit = true;
            }
            else{
                specialChar = true;
            }
        }
       return upper && lower && digit && specialChar;
    }
}
class Solution {
    public boolean checkString(String s) {
        int lastIndex = s.lastIndexOf('a');
        int firstIndex = s.indexOf('b');
        if(lastIndex == -1 || firstIndex == -1){
            return true;
        }
        return lastIndex < firstIndex;
    }
}
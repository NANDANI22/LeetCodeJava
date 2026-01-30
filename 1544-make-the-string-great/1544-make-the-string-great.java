class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (!st.isEmpty() && Character.toLowerCase(st.peek()) == Character.toLowerCase(ch) && st.peek() != ch) {
                st.pop();
            } else {
                st.push(ch);
            }
        }
        String r = "";
        for (char ch : st) {
            r += ch;
        }
        return r;
    }
}
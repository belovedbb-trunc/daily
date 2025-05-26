class Solution {
    public boolean isValid(String s) {
        Stack<Character> ss = new Stack<>();
        int i = 0;
        while(i < s.length()) {
            char ch = s.charAt(i++);
            if(!ss.isEmpty()) {
                char cc = ss.peek();
                if( (cc == '(' && ch == ')') || (cc == '{' && ch == '}')  || (cc == '[' && ch == ']') ) {
                    ss.pop();
                }else {
                    ss.push(ch);
                }
            }else {
                ss.push(ch);
            }
        }
        return ss.isEmpty();
    }
}
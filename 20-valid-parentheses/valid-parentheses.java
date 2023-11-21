class Solution {
    public boolean isValid(String s) {
        Stack<Character> m = new Stack<>();
        char[] chs = s.toCharArray();
        for(int i = 0; i < chs.length; i++) {
            char cur = chs[i];
            if(cur == ')' || cur == '}' || cur == ']') {
                if(m.isEmpty()) return false;
                char vv = m.pop();
                if ( !(vv == '(' && cur == ')' || vv == '[' && cur == ']' || vv == '{' && cur == '}') ) {
                    return false;
                }
            }else {
                m.push(cur);
            }
        }
        return m.isEmpty();
    }
}
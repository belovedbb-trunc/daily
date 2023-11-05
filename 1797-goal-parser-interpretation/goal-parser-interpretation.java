class Solution {
    public String interpret(String command) {
        StringBuilder m = new StringBuilder();
        for(int i = 0; i < command.length();) {
            char val = command.charAt(i);
            if(val == 'G') {
                m.append('G');
                i++;
            } else if(val == '(' && command.charAt(i +1) == ')' ) {
                m.append('o');
                i += 2;
            }else {
                m.append("al");
                i += 4;
            }
        }
        return m.toString();
    }
}
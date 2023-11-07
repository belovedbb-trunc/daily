class Solution {
    public int maximum69Number (int num) {
        char[] chs = String.valueOf(num).toCharArray();
        for(int i = 0 ; i < chs.length; i++) {
            char value  = chs[i];
            if(value == '6') {
                chs[i] = '9';
                break;
            }
        }
        return Integer.parseInt(new String(chs));
    }
}
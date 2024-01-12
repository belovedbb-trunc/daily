class Solution {
    public boolean halvesAreAlike(String s) {
        int ff = 0, ss = 0;
        for(int i = 0; i < s.length();i++) {
            char v = s.charAt(i);
            if(v == 'A' || v == 'a' ||
                v == 'E' || v == 'e'  ||
                v == 'I' || v == 'i'  ||
                v == 'O' || v == 'o'  ||
                v == 'U' || v == 'u' ) {
                   if( i < s.length()/2) ff++;
                   else ss++;
                }
        }
        return ff == ss;
    }
}
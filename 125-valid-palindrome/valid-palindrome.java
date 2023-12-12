class Solution {
    public boolean isPalindrome(String ss) {
        Character.toUpperCase('1');
        char[] s = ss.trim().toCharArray();
        int l = 0, h = s.length -1;
        while(l < h) {
            while(l < s.length && (!Character.isAlphabetic(s[l]) && !Character.isDigit(s[l])) ) l++;
            while(h >= 0 && (!Character.isAlphabetic(s[h]) && !Character.isDigit(s[h]) ) ) h--;
            if(l >= s.length) continue;
            if(h < 0) continue;
            char ll = Character.toUpperCase(s[l]);
            char hh = Character.toUpperCase(s[h]);
            if(ll != hh) return false;
            l++; h--;
        }
        return true;
    }
}
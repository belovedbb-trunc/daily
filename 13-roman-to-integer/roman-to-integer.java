class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> m = new HashMap<>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);
        int res = 0;
        for(int i = 0; i < s.length() - 1; i++) {
            char cur = s.charAt(i);
            char curr = s.charAt(i + 1);
            int vv = m.get(cur);
            int vvv = m.get(curr);
            if(vv < vvv) res -= vv;
            else res += vv;
        }
        res += m.get(s.charAt(s.length() - 1));
        return res;
    }
}
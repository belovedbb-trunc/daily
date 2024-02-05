class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> m = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char v = s.charAt(i);
            int r = m.getOrDefault(v, 0);
            m.put(v, ++r);
        }
        for(int i = 0; i < s.length(); i++) {
            char v = s.charAt(i);
            int r = m.get(v);
            if(r == 1) return i;
        }
        return -1;
    }
}
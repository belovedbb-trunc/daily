class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character, Character> m = new HashMap<>();
        StringBuilder res = new StringBuilder();
        char[] chsk = key.toCharArray();
        char[] chsm = message.toCharArray();
        int ccc = 'a';
        for(int i = 0; i < chsk.length; i++) {
            char ch = chsk[i];
            if(!m.containsKey(ch) && ch != ' ') {
                m.put(ch, (char)ccc);
                ccc++;
            }
        }
        for(Character val: chsm) {
            res.append(m.getOrDefault(val, ' '));
        }
        return res.toString();
    }
}
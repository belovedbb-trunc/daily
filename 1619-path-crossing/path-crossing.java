class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> m = new HashSet<>();
        int x = 0, y = 0;
        char[] chs = path.toCharArray();
        m.add("0,0");
        for(int i = 0; i < chs.length; i++) {
            char cur = chs[i];
            if(cur == 'N') {
                ++y;
            }else if(cur == 'E') {
                ++x;
            }else if(cur == 'W') {
                --x;
            }else {
                --y;
            }
            if(!m.add(x+","+y)) return true;
        }
        return false;
    }
}
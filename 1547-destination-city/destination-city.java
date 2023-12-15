class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String, String> m = new HashMap<>();
        for(List<String> path: paths) {
            m.put(path.get(0), path.get(1));
        }
        String dest = paths.get(0).get(0);
        while(true) {
            String val = m.get(dest);
            if(val == null) break;
            else dest = val;
        }
        return dest;
    }
}
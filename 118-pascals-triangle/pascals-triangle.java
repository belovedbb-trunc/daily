class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> m = new ArrayList<>();
        m.add(List.of(1));
        for(int i = 1; i < numRows;i++) {
            List<Integer> v = m.get(i - 1);
            List<Integer> res = new ArrayList<>();
            int last = 0;
            for(int j = 0; j < v.size(); j++) {
                int vv = v.get(j);
                res.add(last + vv);
                last = vv;
            }
            res.add(last);
            m.add(res);
        }
        return m;
    }
}
class OrderedStream {

    TreeMap<Integer, String> m = new TreeMap<>();
    int count = 0;
    public OrderedStream(int n) {

    }
    
    public List<String> insert(int idKey, String value) {
        List<String> res = new ArrayList<>();
        int curKey = idKey;
        m.put(idKey, value);
        while(curKey == count + 1) {
            String cur = m.get(curKey);
            res.add(cur);
            m.remove(curKey);
            String vv = m.get(curKey + 1);
            if(vv == null) curKey = -1;
            else curKey++;
            count++;
        }
        return res;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */
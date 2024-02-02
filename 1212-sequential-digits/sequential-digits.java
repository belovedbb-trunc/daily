class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> m = new ArrayList<>();
        for(int i = 1; i <= 9; i++) {
            int v = i;
           for(int j = i + 1; j <= 9; j++) {
               v = (v * 10) +  j;
               if(v >= low && v <= high) {
                   m.add(v);
               }
           }
        }
        Collections.sort(m);
        return m;
    }
}
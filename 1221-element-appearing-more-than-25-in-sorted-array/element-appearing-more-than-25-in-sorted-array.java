class Solution {
    public int findSpecialInteger(int[] arr) {
        int count = (int) (0.25 * arr.length);
        int cur = arr[0], cou = 1;
        for(int i = 1; i < arr.length; i++) {
            int v = arr[i];
            if(cur == v){
                cou++;
            }else {
                cur = v;
                cou = 1;
            }
            if(cou > count) return cur;
        }
        return cur;
    }
}
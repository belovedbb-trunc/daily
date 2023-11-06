class Solution {
    public int minimumSum(int num) {
        char[] chs = (""+num).toCharArray();
        Arrays.sort(chs);
        int f = Integer.parseInt(""+chs[0]+""+chs[2]);
        int s = Integer.parseInt(""+chs[1]+""+chs[3]);
        return f+s;
    }
}

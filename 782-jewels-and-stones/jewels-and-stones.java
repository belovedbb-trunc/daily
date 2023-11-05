class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char[] chJ = jewels.toCharArray();
        char[] chS = stones.toCharArray();
        int count = 0;
        for(int i = 0; i < chS.length; i++) {
            char curS = chS[i];
            for(int j = 0; j < chJ.length; j++) {
                if(curS == chJ[j]) {count++;break;}
            }
        }
        return count;
    }
}
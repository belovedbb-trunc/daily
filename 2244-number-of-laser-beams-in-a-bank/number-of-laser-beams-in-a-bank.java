class Solution {
    public int numberOfBeams(String[] bank) {
        int count = 0;
        for(int i = 0; i < bank.length; i++) {
            String value = bank[i];
            int g = get1Count(value.toCharArray());
            if(g <= 0) continue;
            int gg = 0;
            for(int j = i + 1; j < bank.length; j++) {
                String value2 = bank[j];
                gg = get1Count(value2.toCharArray());
                if(gg > 0) break;
            }
            count += (g * gg);
        }
        return count;
    }

    int get1Count(char[] chs) {
        int c  = 0;
        for(int i = 0; i < chs.length; i++) {
            if(chs[i] == '1') c++;
        }
        return c;
    }
}

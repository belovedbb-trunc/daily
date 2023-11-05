class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            int cur = nums[i], count = 0;
            for(int j = 0; j < nums.length; j++) {
                if(i == j) continue;
                int cc = nums[j];
                if(cc < cur) count++;
            }
            res[i] = count;
        }
        return res;
    }
}
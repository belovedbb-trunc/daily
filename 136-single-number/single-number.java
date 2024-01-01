class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            int v = nums[i];
            if( (i + 1) >= nums.length) return v;
            int vv = nums[i + 1];
            if(v != vv) return v;
            i++;
        }
        return -1;
    }
}
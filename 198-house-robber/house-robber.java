class Solution {
    Map<Integer, Integer> m = new HashMap<>();
    public int rob(int[] nums) {
        return Math.max(rob(nums, 0, m), rob(nums, 1, m));
    }

    int rob(int[] nums, int index, Map<Integer, Integer> m) {
        if(m.containsKey(index)) return m.get(index);
        if(index >= nums.length) return 0;
        int max = nums[index];
        for(int i = index + 2; i <nums.length; i++)
             max = Math.max(max, nums[index] + rob(nums, i, m));
        m.put(index, max);
        return max;
    }
}

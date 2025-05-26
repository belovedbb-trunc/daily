class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if(m.containsKey(diff)) {
                return new int[] {i, m.get(diff)};
            }
            m.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
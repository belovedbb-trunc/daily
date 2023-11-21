class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            int value = target - cur;
            if(m.containsKey(value)) return new int[]{m.get(value), i};
            m.put(cur, i);
        }
        return new int[0];
    }
}
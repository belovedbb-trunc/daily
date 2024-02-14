import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        List<Integer> c = new ArrayList<>();

        // Separate positive and negative integers into two separate arrays
        for (int num : nums) {
            if (num > 0)
                a.add(num);
            else
                b.add(num);
        }

        // Interleave positive and negative integers while preserving their order
        int count = 0, c1 = 0, c2 = 0;
        for (int num : nums) {
            if (count % 2 == 0) {
                int n = a.get(c1++);
                c.add(n);
            } else {
                int n = b.get(c2++);
                c.add(n);
            }
            count++;
        }

        // Convert List<Integer> to int[]
        int[] result = new int[c.size()];
        for (int i = 0; i < c.size(); i++) {
            result[i] = c.get(i);
        }

        return result;
    }
}
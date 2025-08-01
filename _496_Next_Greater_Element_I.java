import java.util.*;

class _496_Next_Greater_Element_I {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        Stack<Integer> stack = new Stack();
        Map<Integer, Integer> table = new HashMap();

        for (int i = n2 - 1; i >= 0; i--) {
            while (!stack.isEmpty() && !(stack.peek() > nums2[i])) {
                stack.pop();
            }

            table.put(nums2[i], !stack.isEmpty() ? stack.peek() : -1);
            stack.push(nums2[i]);
        }

        int[] ans = new int[n1];
        for (int i = 0; i < n1; i++) {
            ans[i] = table.get(nums1[i]);
        }

        return ans;
    }
}
